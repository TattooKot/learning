package main.java.com.tattookot.javacore.chapter15;

interface MyFunc{
    int func(int n);
}

public class VarCapture {
    public static void main(String[] args) {
        int val = 10;

        MyFunc mf = (n) -> {
            int v = val + n;
            // val++ - Error
            // val = 9 - Error
            return v;
        };


    }
}
