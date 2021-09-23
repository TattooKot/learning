package main.java.com.tattookot.javacore.chapter20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

class InputStreamEnumeration implements Enumeration<FileInputStream>{
    private final Enumeration<String> files;

    public InputStreamEnumeration(Vector<String> files) {
        this.files = files.elements();
    }

    @Override
    public boolean hasMoreElements() {
        return files.hasMoreElements();
    }

    @Override
    public FileInputStream nextElement() {
        try{
            return new FileInputStream(files.nextElement());
        } catch (Exception e) {
            return null;
        }
    }
}

public class SequenceInputStreamDemo {
    public static void main(String[] args) {
        int c;
        Vector<String> files = new Vector<>();

        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumeration ise = new InputStreamEnumeration(files);

        try(InputStream input = new SequenceInputStream(ise)){
            while((c = input.read()) != -1) System.out.print((char) c);

        } catch (IOException | NullPointerException e) {
            System.out.println("Error");
        }
    }
}
