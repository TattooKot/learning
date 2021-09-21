package main.java.com.tattookot.javacore.chapter13;

public class NativeDemo {

    static {
        System.loadLibrary("NativeDemo");
    }

    int i;

    public static void main(String[] args) {
        NativeDemo ob = new NativeDemo();
        ob.i = 10;

        System.out.println("i before native method called");
        ob.test();
        System.out.println("i after native method called");
    }

    public native void test();
}
