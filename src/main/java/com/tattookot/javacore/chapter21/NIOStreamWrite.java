package main.java.com.tattookot.javacore.chapter21;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream outputStream = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){
            for(int i = 0; i<26; i++) outputStream.write((byte) ('A' + i));


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
