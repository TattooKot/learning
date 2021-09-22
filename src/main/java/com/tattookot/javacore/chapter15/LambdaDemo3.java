package main.java.com.tattookot.javacore.chapter15;

interface NumericTest2{
    boolean test(int n, int d);
}

public class LambdaDemo3 {
    public static void main(String[] args) {

        NumericTest2 isFactor = (n,d) -> n % d == 0;

        if(isFactor.test(10,2)) System.out.println("True");
        if(!isFactor.test(10,3)) System.out.println("False");

    }
}
