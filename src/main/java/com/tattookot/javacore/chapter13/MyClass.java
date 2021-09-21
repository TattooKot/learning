package main.java.com.tattookot.javacore.chapter13;

public class MyClass {
    int a;
    int b;

    public MyClass(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public MyClass(int a) {
        this(a,a);
    }

    public MyClass() {
        this(0);
    }
}
