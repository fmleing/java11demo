package com.feng.java11.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RefluenceDemo {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        nest();
    }

    public static void nest() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        System.out.println(RefluenceMainDemo.class.getNestHost().getName());
        System.out.println(RefluenceMainDemo.Nested.class.getNestHost().getName());
        System.out.println(RefluenceMainDemo.Nested.class.isNestmateOf(RefluenceMainDemo.class));
        Arrays.stream(RefluenceMainDemo.Nested.class.getNestMembers())
                .map(Class::getName).forEach(System.out::println);

        var ob = new RefluenceMainDemo();
        Method method = RefluenceMainDemo.class.getDeclaredMethod("myPrivate");
        method.invoke(ob);
    }
}
