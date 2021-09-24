package main.java.com.tattookot.javacore.chapter21;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class NIOCopy {
    public static void main(String[] args) {
        if(args.length != 2){
            System.out.println("You need two arguments: from and to");
            return;
        }

        try {
            Path from = Path.of(args[0]);
            Path to = Path.of(args[1]);
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
