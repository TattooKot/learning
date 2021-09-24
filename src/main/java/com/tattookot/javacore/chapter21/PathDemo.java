package main.java.com.tattookot.javacore.chapter21;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class PathDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        Path filepath = Paths.get("C:\\Users\\Acer\\IdeaProjects\\learning\\test.txt");
        p("File name: " + filepath.getName(0));
        p("File path: " + filepath);
        p("Absolute file path: " + filepath.toAbsolutePath());
        p("Parent file path: " + filepath.getParent());
        p(Files.exists(filepath) ? "Exists" : "Not exists");

        try {
            p(Files.isHidden(filepath) ? "Hidden" : "Isn`t hidden");
        } catch (IOException e) {
            System.out.println("Hidden error");
        }

        p(Files.isReadable(filepath) ? "Can read" : "Can`t read");
        p(Files.isWritable(filepath) ? "Can write" : "Can`t write");

        try {
            BasicFileAttributes attributes = Files.readAttributes(filepath, BasicFileAttributes.class);

            p(attributes.isDirectory() ? "It`s directory" : "Isn`t directory");
            p(attributes.isRegularFile() ? "It`s file" : "Isn`t file");
            p(attributes.isSymbolicLink() ? "It`s link" : "Isn`t link");

            p("Last modification: " + attributes.lastModifiedTime());
            p("Size: " + attributes.size() + " bytes");
        } catch (IOException e) {
            System.out.println("Atr exception");
        }
    }
}
