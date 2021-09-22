package main.java.com.tattookot.javacore.chapter15;

interface MyNumber{
    double getValue();
}

public class LambdaDemo {
    public static void main(String[] args) {

        MyNumber mn;
        mn = () -> 123.45;
        System.out.println("Fixed value: " + mn.getValue());

        mn = () -> Math.random() * 100;

        System.out.println("Random value: " + mn.getValue());
        System.out.println("One more random value: " + mn.getValue());


    }
}
