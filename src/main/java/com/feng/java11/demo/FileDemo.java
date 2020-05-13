package com.feng.java11.demo;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
    public static void main(String[] args) {
        java11BeforeDemo();
        System.out.println("======");
        java11Demo();
    }

    public static void java11BeforeDemo(){
        // 1. 创建 Path
        Path path = Paths.get("classpath:fileDemo.txt");
        //2. 读取数据
        try {
            byte[] bs = Files.readAllBytes(path);
            System.out.println(new String(bs));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void java11Demo(){
        // 1. 创建 Path
        Path path = Paths.get("classpath:fileDemo.txt");
        //2. 读取数据
        try {
            String string = Files.readString(path);
            System.out.println(string);
            String string1 = Files.readString(path,StandardCharsets.UTF_8);
            System.out.println(string1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
