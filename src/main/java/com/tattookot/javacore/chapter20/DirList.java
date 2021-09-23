package main.java.com.tattookot.javacore.chapter20;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        String dirname = "src/main/java/com/tattookot/javacore/chapter20";
        File f1 = new File(dirname);

        if(f1.isDirectory()){
            System.out.println("Directory: " + dirname);
            String[] files = f1.list();

            for(int i = 0; i< files.length; i++){
                File file = new File(dirname + "/" + files[i]);
                if(file.isDirectory()) System.out.println(file.getName() + " is directory");
                if(file.isFile()) System.out.println(file.getName() + " is file");
            }

        } else System.out.println(dirname + " isn`t directory");
    }
}
