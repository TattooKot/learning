package main.java.com.tattookot.javacore.chapter20;

public class PrintfDemo {
    public static void main(String[] args) {
        System.out.printf("Different integers: %d, (%d), +%d, %05d\n", 3,-3,3,3);
        System.out.printf("Double: %f\n", 123.45);
        System.out.printf("Negative double: %,f\n", -1234.56 );
    }
}
