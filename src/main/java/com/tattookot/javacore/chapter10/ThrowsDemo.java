package main.java.com.tattookot.javacore.chapter10;

public class ThrowsDemo {
    static void throwOne() throws IllegalAccessException{
        System.out.println("Inside throwOne method");
        throw new IllegalAccessException("Demonstration");
    }

    public static void main(String[] args) {
        try{
            throwOne();
        }  catch (IllegalAccessException e){
            System.out.println("Catches exception: " + e);
        }
    }
}
