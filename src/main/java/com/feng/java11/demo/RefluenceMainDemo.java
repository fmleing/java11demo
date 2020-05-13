package com.feng.java11.demo;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class RefluenceMainDemo {

    public void myPublic() {
    }

    private void myPrivate() {
    }

    class Nested {

        public void nestedPublic() {
            myPrivate();
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException,
            IllegalAccessException {
        Method method = RefluenceMainDemo.class.getDeclaredMethod("myPrivate");
        method.invoke(RefluenceMainDemo.class);
    }
}
