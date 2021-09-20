package main.java.com.tattookot.javacore.chapter10;

public class ChainExcDemo {
    static void demoproc(){
        NullPointerException e = new NullPointerException("High level");
        e.initCause(new ArithmeticException("reason"));
        throw e;
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e);
            System.out.println("The root cause: " + e.getCause());
        }
    }
}
