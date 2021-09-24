package main.java.com.tattookot.javacore.chapter20;

import java.io.*;

class MyClass implements Serializable{
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "s='" + s + '\'' +
                ", i=" + i +
                ", d=" + d +
                '}';
    }
}

public class SerializationDemo {
    public static void main(String[] args) {

        try(ObjectOutputStream objOStrm = new ObjectOutputStream(new FileOutputStream("serial.dat"))){
            MyClass obj = new MyClass("String", 1, 123.45);
            System.out.println("Writing: " + obj);
            objOStrm.writeObject(obj);
        } catch (IOException e) {
            System.out.println("Writing exception");
        }

        try(ObjectInputStream objIStrm = new ObjectInputStream(new FileInputStream("serial.dat"))){
            Object o = objIStrm.readObject();
            MyClass myObj = null;
            if(o instanceof MyClass) myObj = (MyClass) o;
            System.out.println("Reading: " + myObj);

        }  catch (IOException | ClassNotFoundException e) {
            System.out.println("Reading exception");
        }
    }
}
