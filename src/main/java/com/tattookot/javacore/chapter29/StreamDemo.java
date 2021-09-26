package main.java.com.tattookot.javacore.chapter29;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(7);
        myList.add(18);
        myList.add(10);
        myList.add(24);
        myList.add(17);
        myList.add(5);

        System.out.println("myList: " + myList);

        Stream<Integer> myStream = myList.stream();

        Optional<Integer> min = myStream.min(Integer::compare);
        min.ifPresent(integer -> System.out.println("Min: " + integer));

        myStream = myList.stream();

        Optional<Integer> max = myStream.max(Integer::compare);
        max.ifPresent(integer -> System.out.println("Max: " + integer));

        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.print("Sorted: ");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        Stream<Integer> odd = myList.stream().sorted().filter((n) -> (n % 2) == 1);
        System.out.print("Odd: ");
        odd.forEach((n) -> System.out.print(n + " "));
        System.out.println();

        odd = myList.stream().sorted().filter((n) -> (n % 2) == 1).filter((n) -> n > 5);
        System.out.print("Odd>5: ");
        odd.forEach((n) -> System.out.print(n + " "));
        System.out.println();
    }
}
