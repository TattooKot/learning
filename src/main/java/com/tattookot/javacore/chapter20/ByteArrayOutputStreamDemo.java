package main.java.com.tattookot.javacore.chapter20;

import java.io.*;

public class ByteArrayOutputStreamDemo {
    public static void main(String[] args) {
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s = "Info for array write";
        byte[] buf = s.getBytes();

        try{
            f.write(buf);
        } catch (IOException e) {
            System.out.println("Error");
            return;
        }

        System.out.println("Buffer to string");
        System.out.println(f);
        System.out.println("to array");

        byte[] b = f.toByteArray();
        for (byte value : b) System.out.print((char) value);
        System.out.println("\n to OutputStream");

        try(FileOutputStream f2 = new FileOutputStream("test.txt")){
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
