package main.java.com.tattookot.javacore.chapter13;

import java.io.*;

public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write 'q' if you wanna leave");
        do{
            c = (char) reader.read();
            System.out.println(c);
        } while(c != 'q');

    }
}
