package com.feng.java11.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefluenceDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        var ob = new RefluenceMainDemo();
        Method method = ob.getClass().getDeclaredMethod("myPrivate");
        method.invoke(ob);
    }
}
