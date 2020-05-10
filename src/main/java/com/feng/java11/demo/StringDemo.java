package com.feng.java11.demo;

public class StringDemo {

    public static void main(String[] args) {
        isBlankDemo();
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
}
