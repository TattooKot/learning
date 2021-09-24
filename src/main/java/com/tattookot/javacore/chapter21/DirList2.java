package main.java.com.tattookot.javacore.chapter21;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class DirList2 {
    public static void main(String[] args) {
        String dirName = "src/main/java/com/tattookot/javacore/chapter21";

        DirectoryStream.Filter<Path> how = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                if(Files.isReadable(entry)) return true;
                return false;
            }
        };

        try (DirectoryStream<Path> dirStrm = Files.newDirectoryStream(Paths.get(dirName), how)){

            System.out.println("Directory: " + dirName);

            for(Path p : dirStrm){

                BasicFileAttributes attributes = Files.readAttributes(p, BasicFileAttributes.class);
                if(attributes.isDirectory()) System.out.print("<DIR>");
                else System.out.print("     ");
                System.out.println(p.getName(7));
            }


        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
