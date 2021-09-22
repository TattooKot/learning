package main.java.com.tattookot.javacore.chapter15;

interface SomeFunc<T>{
    T func (T t);
}

public class GenericFunctionalInterfaceDemo {
    public static void main(String[] args) {
        SomeFunc<String> reverse = (str) -> {
            String result = "";

            for(int i = str.length()-1; i>=0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Test reversed: " + reverse.func("Test"));
        System.out.println("Java reversed: " + reverse.func("Java"));


        SomeFunc<Integer> factorial = (n) -> {
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
