package main.java.com.tattookot.javacore.chapter18;

import java.io.*;
import java.util.Properties;

public class PhoneBook {
    public static void main(String[] args) throws IOException{
        Properties hr = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name, number;
        FileInputStream fin = null;
        boolean changed = false;

        try{
            fin = new FileInputStream("phonebook.dat");
        }catch (FileNotFoundException ignored) {

        }

        try{
            if(fin != null) {
                hr.load(fin);
                fin.close();
            }
        } catch (IOException ignored) {
            System.out.println("Error while reading file");
        }

        do{
            System.out.println("Write name to add or 'exit' for finish");
            name = br.readLine();
            if (name.equals("exit")) continue;
            System.out.println("Write number");
            number = br.readLine();
            hr.put(name,number);
            changed = true;
        } while (!name.equals("exit"));

        if(changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            hr.store(fout, "PhoneBook");
            fout.close();
        }

        do{
            System.out.println("Write name for search or 'exit' for finish");
            name = br.readLine();
            if (name.equals("exit")) continue;
            number =(String) hr.get(name);
            System.out.println(number);
        } while (!name.equals("exit"));

    }
}
