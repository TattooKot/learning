package main.java.com.tattookot.javacore.chapter13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        if (args.length != 2) {
            System.out.println("For using this file write: ShowFile.java from_file to_file");
            return;
        }

        try{
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do{
                i = fin.read();
                if(i != -1) fout.write(i);
            }while(i != -1);
        } catch (IOException e) {
            System.out.println("I/O Exception: " + e);
        } finally {
            try{
                if(fin != null) fin.close();
            } catch (IOException e) {
                System.out.println("Error while closing reading file ");
            }

            try{
                if(fout != null) fout.close();
            } catch (IOException e) {
                System.out.println("Error while closing writing file");
            }
        }
    }

}