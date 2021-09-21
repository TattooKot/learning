package main.java.com.tattookot.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;


        if (args.length != 1) {
            System.out.println("For using this file write: ShowFile.java file_name");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            return;
        }

        try{
            do{
                i = fin.read();
                if(i != -1) System.out.println(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Error while reading from file");
        }

        try{
            fin.close();
        } catch (IOException e) {
            System.out.println("Error while file closing");
        }

    }
}
