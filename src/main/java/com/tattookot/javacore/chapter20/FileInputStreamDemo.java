package main.java.com.tattookot.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
    public static void main(String[] args) {
        int size;

        try(FileInputStream f = new FileInputStream("C:\\Users\\Acer\\IdeaProjects\\learning\\src\\main\\java\\com\\tattookot\\javacore\\chapter20\\FileInputStreamDemo.java")){

            System.out.println("Available bytes: " + (size = f.available()));
            int n = size / 40;

            System.out.println("First " + n + " bytes readied by read method");
            for(int i = 0; i<n; i++)
                System.out.print((char) f.read());

            System.out.println("\nAvailable: " + f.available());
            System.out.println("Next " + n + " bytes readied by read(byte[]) method");

            byte[] b = new byte[n];
            f.read(b);

            System.out.println(new String(b, 0, n));
            System.out.println("Available: " + (size = f.available()));
            System.out.println("Skip: " + size/2);
            f.skip(size/2);
            System.out.println("Available: " + (size = f.available()));
            System.out.println("Reading " + n/2 + " bytes to end of array");
            f.read(b, n/2, n/2);
            System.out.println(new String(b, 0 , b.length));
            System.out.println("Available: " + (size = f.available()));
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}
