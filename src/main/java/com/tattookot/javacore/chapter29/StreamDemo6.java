package main.java.com.tattookot.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo6 {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<>();
        myList.add(1.1);
        myList.add(3.6);
        myList.add(9.2);
        myList.add(4.7);
        myList.add(12.1);
        myList.add(5.0);

        System.out.print("MyList: ");
        myList.stream().forEach(n -> System.out.print(n + " "));
        System.out.println();

        System.out.print("Int stream: ");
        myList.stream().mapToInt(n -> (int) Math.ceil(n)).forEach(n -> System.out.print(n + " "));
        System.out.println();
    }
}
