package main.java.com.tattookot.javacore.chapter20;

import java.io.File;

public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("src/main/java/com/tattookot/javacore/chapter20/COPYRIGHT.txt");
        p("File name: " + f1.getName());
        p("File path: " + f1.getPath());
        p("Absolute file path: " + f1.getAbsolutePath());
        p("Parent file path: " + f1.getParent());
        p(f1.exists() ? "Exists" : "Not exists");
        p(f1.canWrite() ? "Can write" : "Can`t write");
        p(f1.canRead() ? "Can read" : "Can`t read");
        p(f1.isDirectory() ? "It`s directory" : "Isn`t directory");
        p(f1.isFile() ? "It`s file" : "Isn`t file");
        p(f1.isAbsolute() ? "It`s absolute path" : "Isn`t absolute path");
        p("Last modification: " + f1.lastModified());
        p("Size: " + f1.length() + " bytes");
    }
}
