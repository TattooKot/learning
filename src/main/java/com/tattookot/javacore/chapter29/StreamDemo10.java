package main.java.com.tattookot.javacore.chapter29;

import java.util.ArrayList;
import java.util.Spliterator;
import java.util.stream.Stream;

public class StreamDemo10 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Альфа");
        list.add("Бета");
        list.add("Гамма");
        list.add("Дельта");
        list.add("Кси");
        list.add("Омега");

        Stream<String> stream = list.stream();

        Spliterator<String> spliterator = stream.spliterator();

        Spliterator<String> spliterator2 = spliterator.trySplit();

        if(spliterator2 != null){
            System.out.println("Spliterator 2:");
            spliterator2.forEachRemaining(System.out::println);
        }

        System.out.println("Spliterator 1: ");
        spliterator.forEachRemaining(System.out::println);


    }
}
