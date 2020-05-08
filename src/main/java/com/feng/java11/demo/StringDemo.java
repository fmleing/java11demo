package com.feng.java11.demo;

public class StringDemo {

    public static void main(String[] args) {
        String willStrip = "  Strip  ";
        System.out.println(willStrip.strip());
        String willStripLeading = " StripLeading  ";
        System.out.println(willStripLeading.stripLeading());
        String willStripTrailing = " StripTrailing  ";
        System.out.println(willStripTrailing.stripTrailing());
    }
}
