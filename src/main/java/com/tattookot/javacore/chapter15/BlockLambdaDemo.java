package main.java.com.tattookot.javacore.chapter15;

interface NumericFunc{
    int func(int n);
}

public class BlockLambdaDemo {
    public static void main(String[] args) {
        NumericFunc factorial = (n) -> {
            int result = 1;

            for(int i = 1; i<=n; i++){
                result *= i;
            }
            return result;
        };

        System.out.println("Factorial of 3: " + factorial.func(3));
        System.out.println("Factorial of 5: " + factorial.func(5));
    }
}
