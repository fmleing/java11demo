package com.feng.java11.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Paths;
import java.time.Duration;

public class HttpClientDemo {

    public static void main(String[] args) throws IOException, InterruptedException {




        HttpClient client = HttpClient.newBuilder()
                // 协议版本，HTTP/1.1 还是 HTTP/2
                .version(HttpClient.Version.HTTP_2)
                //是否支持重定向
                .followRedirects(HttpClient.Redirect.NORMAL)
                //配置代理
                .proxy(ProxySelector.of(new InetSocketAddress("www-proxy.com", 8080)))
                //认证
                .authenticator(Authenticator.getDefault())
                .build();

        // HttpRequest.Builder 构建 HttpRequest，可多次发送，不可更改
        HttpRequest request = HttpRequest.newBuilder()
                // 请求rui
                .uri(URI.create("http://www.feng.com/"))
                // 超时时间
                .timeout(Duration.ofMinutes(1))
                // 请求头参数设置
                .header("Content-Type", "application/json")
                // POST 文件请求  GET，POST，PUT ... 等请求方式
                .POST(HttpRequest.BodyPublishers.ofFile(Paths.get("file.json")))
                .build();
        // 同步发送请求，阻塞，会抛出中断异常
        HttpResponse<String> response =
                client.send(request, HttpResponse.BodyHandlers.ofString());

        // 异步发送
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
