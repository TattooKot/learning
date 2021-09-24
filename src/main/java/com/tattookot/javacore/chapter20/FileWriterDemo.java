package main.java.com.tattookot.javacore.chapter20;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
    public static void main(String[] args) {
        String source = "Example of text file\nString next line(number 2)\nand string number 3";
        char[] buf = new char[source.length()];
        source.getChars(0, source.length(), buf, 0);

        try(FileWriter file1 = new FileWriter("file1.txt");
            FileWriter file2 = new FileWriter("file2.txt");
            FileWriter file3 = new FileWriter("file3.txt"))
        {
            for(int i = 0; i< buf.length; i += 2) file1.write(buf[i]);

            file2.write(buf);

            file3.write(buf, buf.length/4, buf.length/4);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
