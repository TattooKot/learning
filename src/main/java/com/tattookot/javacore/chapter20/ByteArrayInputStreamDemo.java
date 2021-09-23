package main.java.com.tattookot.javacore.chapter20;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) throws IOException {

        String s = "abcdefghijklmnopqrstuvwxyz";
        byte[] b = s.getBytes();

        ByteArrayInputStream stream1 = new ByteArrayInputStream(b);
        ByteArrayInputStream stream2 = new ByteArrayInputStream(b,0,3);

    }
}
