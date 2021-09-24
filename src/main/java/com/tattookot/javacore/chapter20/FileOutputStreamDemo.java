package main.java.com.tattookot.javacore.chapter20;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
    public static void main(String[] args) {
        String source = "Example of text file\n String next line(number 2)\n and string number 3";
        byte[] buf = source.getBytes();

        try(FileOutputStream file1 = new FileOutputStream("file1.txt");
            FileOutputStream file2 = new FileOutputStream("file2.txt");
            FileOutputStream file3 = new FileOutputStream("file3.txt"))
        {
            for(int i = 0; i< buf.length; i += 2) file1.write(buf[i]);

            file2.write(buf);

            file3.write(buf, buf.length/4, buf.length/4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
