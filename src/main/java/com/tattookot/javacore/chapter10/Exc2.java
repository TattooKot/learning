package main.java.com.tattookot.javacore.chapter10;

public class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try{
            d = 0;
            a = 42/d;
            System.out.println("You will never see that");
        }catch (ArithmeticException e){
            System.out.println("Division by 0.");
        }

        System.out.println("After catch");
    }
}
