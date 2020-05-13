package com.feng.java11.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    private class MyPrivateClass {
        private void myPrivateMethod(){
            System.out.println("myPrivateMethod");
        }
    }
    public static void main(String[] args) throws NoSuchMethodException,InvocationTargetException, IllegalAccessException {
        Main m = new Main();
        MyPrivateClass mp = m.new MyPrivateClass();
        Method method = MyPrivateClass.class.getDeclaredMethod("myPrivateMethod");
        method.invoke(m);
    }
}
