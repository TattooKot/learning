package main.java.com.tattookot.javacore.chapter10;

public class ThrowDemo {
    static void demoproc(){
        try{
            throw new NullPointerException("Demonstration");
        } catch (NullPointerException e){
            System.out.println("Exception catches in demoproc");
            throw e;
        }
    }

    public static void main(String[] args) {
        try{
            demoproc();
        } catch (NullPointerException e){
            System.out.println("Re-catche: " + e);
        }
    }
}
