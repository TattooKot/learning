package main.java.com.tattookot.javacore.chapter20;

import java.io.FileWriter;
import java.io.CharArrayWriter;
import java.io.IOException;

public class CharArrayWriterDemo {
    public static void main(String[] args) {
        CharArrayWriter f = new CharArrayWriter();
        String s = "Info for array write";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        try{
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Error");
            return;
        }

        System.out.println("Buffer to string");
        System.out.println(f);
        System.out.println("to array");

        char[] c = f.toCharArray();
        for (char value : c) System.out.print(value);
        System.out.println("\n to OutputStream");

        try(FileWriter f2 = new FileWriter("test.txt")){
            f.writeTo(f2);

        }  catch (IOException e) {
            System.out.println("Error");
            return;
        }

        System.out.println("Reset");
        f.reset();

        for(int i = 0; i < 3; i++) f.write('X');

        System.out.println(f);

    }
}
