package main.java.com.tattookot.javacore.chapter20;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayReaderDemo {
    public static void main(String[] args) throws IOException {

        String s = "abcdefghijklmnopqrstuvwxyz\n";
        int length = s.length();
        char[] array = new char[length];

        s.getChars(0, length, array, 0);
        int i;

        CharArrayReader input1 = new CharArrayReader(array);
        System.out.println("Input1: ");
        while((i = input1.read()) != -1) System.out.print((char) i);

        CharArrayReader input2 = new CharArrayReader(array, 0, 5);
        System.out.println("Input2: ");
        while((i = input2.read()) != -1) System.out.print((char) i);
    }
}
