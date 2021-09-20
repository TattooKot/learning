package main.java.com.tattookot.javacore.chapter10;

public class Exc1 {
    public static void subroutine(){
        int d = 0;
        int a = 42/d;
    }

    public static void main(String[] args) {
        Exc1.subroutine();
        /*
        java.lang.ArithmeticException: / by zero
	    at Exc1.subroutine(Exc1.java:6)
	    at Exc1.main(Exc1.java:10)
         */
    }
}
