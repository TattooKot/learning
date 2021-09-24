package main.java.com.tattookot.javacore.chapter21;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

class MyFileVisitor extends SimpleFileVisitor<Path>{
    public  FileVisitResult visitFile(Path path, BasicFileAttributes attributes) throws IOException {
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }

}

public class DirTreeList {
    public static void main(String[] args) {
        String dirname = "C:\\Users\\Acer\\IdeaProjects\\learning\\src\\main\\java\\com\\tattookot\\javacore";
        System.out.println("Path starts with: " + dirname);
        try {
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
