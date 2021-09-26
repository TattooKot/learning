package main.java.com.tattookot.javacore.chapter29;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.stream.Stream;

public class StreamDemo8 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Альфа");
        list.add("Бета");
        list.add("Гамма");
        list.add("Дельта");
        list.add("Кси");
        list.add("Омега");

        Stream<String> stream = list.stream();

        Iterator<String> iterator = stream.iterator();

        while (iterator.hasNext()) System.out.println(iterator.next());
    }
}
