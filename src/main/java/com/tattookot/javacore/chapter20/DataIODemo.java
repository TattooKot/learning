package main.java.com.tattookot.javacore.chapter20;

import java.io.*;

public class DataIODemo {
    public static void main(String[] args) {
        try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(123.1);
            dout.writeInt(1000);
            dout.writeBoolean(false);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException");
        }

        try(DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
            double d = din.readDouble();
            int i = din.readInt();
            boolean b = din.readBoolean();

            System.out.println(d + " " + i + " " + b);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("IOException");
        }
    }
}
