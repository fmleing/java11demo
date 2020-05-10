package com.feng.java11.demo;

import java.util.stream.Collectors;

public class StringDemo {

    public static void main(String[] args) {
        repeat();
    }

    public static void stripDemo(){
        String willStrip = "  Strip  tag";
        System.out.println(willStrip.strip());
        String willStripLeading = " StripLeading  tag";
        System.out.println(willStripLeading.stripLeading());
        String willStripTrailing = " StripTrailing  tag";
        System.out.println(willStripTrailing.stripTrailing());
    }

    public static void isBlankDemo(){
        String blank = "   ";
        System.out.println(blank.isBlank());
    }

    public static void lines(){
        var lineSeparator = System.lineSeparator();
        var author1 = "江户川柯南";
        var author2 = "阿秋莎";
        var author3 = "柯南道尔";
        var meet = author1 +lineSeparator + author2+lineSeparator +  author3;
        System.out.println(meet);
        System.out.println("==========");
        System.out.println(meet.lines().collect(Collectors.toList()));
    }

    public static void repeat(){
        var repead = "repead";
        var tenRepead = repead.repeat(10);
        System.out.println(repead);
        System.out.println("========");
        System.out.println(tenRepead);
    }
}
