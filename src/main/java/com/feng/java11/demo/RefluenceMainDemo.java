package com.feng.java11.demo;


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
}
