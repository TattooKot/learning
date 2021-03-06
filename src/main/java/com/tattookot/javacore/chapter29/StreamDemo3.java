package main.java.com.tattookot.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;

public class StreamDemo3 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(7.0);
        myList.add(18.0);
        myList.add(10.0);
        myList.add(24.0);
        myList.add(17.0);
        myList.add(5.0);

        double prod = myList.parallelStream().reduce(1.0,
                (a,b) -> a * Math.sqrt(b),
                (a,b) -> a*b);
        System.out.println("Prod: " + prod);

    }
}
