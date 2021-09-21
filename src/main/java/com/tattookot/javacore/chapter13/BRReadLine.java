package main.java.com.tattookot.javacore.chapter13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Write your text");
        System.out.println("Write 'stop' if you wanna leave");

        do{
            str = reader.readLine();
            System.out.println(str);
        } while(str.equals("exit"));

    }
}
