package com.feng.java11.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemo {
    public static void main(String[] args) {
        java11BeforeReadDemo();
        System.out.println("======");
        java11ReadDemo();
    }

    public static void java11BeforeWriteDemo(){

        String str = "This is java11 before writer demo";

        try(BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/Mengleifeng/Documents/学习文档/项目/开源项目/java11demo/src/main/resources/fileDemo.txt"));) {
            writer.write(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void java11WriteDemo(){
        var File_Path = Paths.get("/Users/Mengleifeng/Documents/学习文档/项目/开源项目/java11demo/src/main/resources/fileDemo.txt");

        try {

            // 写入 This is write demo
            Files.writeString(File_Path, "This is java11 write demo", LinkOption.values());

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void java11BeforeReadDemo(){
        // 1. 创建 Path
        Path path = Paths.get("/Users/Mengleifeng/Documents/学习文档/项目/开源项目/java11demo/src/main/resources/fileDemo.txt");
        //2. 读取数据
        try {
            byte[] bs = Files.readAllBytes(path);
            System.out.println(new String(bs));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void java11ReadDemo(){
        // 1. 创建 Path
        Path path = Paths.get("/Users/Mengleifeng/Documents/学习文档/项目/开源项目/java11demo/src/main/resources/fileDemo.txt");
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

    public static void isSameFileDemo(){
        Path path1 = Paths.get("/Users/Mengleifeng/Documents/学习文档/项目/开源项目/java11demo/src/main/resources/fileDemo.txt");
        Path path2 = Paths.get("/Users/Mengleifeng/Documents/学习文档/项目/开源项目/java11demo/src/main/resources/fileDemo.txt");
        Files file1 = Files.getFileAttributeView(path1);
    }
}
