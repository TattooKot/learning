package main.java.com.tattookot.javacore.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);

        Comparator<Integer> comparator = Comparator.reverseOrder();

        Collections.sort(ll, comparator);

        System.out.print("Reverse sorted list: ");

        for(int i : ll)
            System.out.print(i + " ");

        System.out.println();

        Collections.shuffle(ll);

        System.out.print("Shuffled list: ");

        for(int i : ll)
            System.out.print(i + " ");

        System.out.println();
        System.out.println("min: " + Collections.min(ll));
        System.out.println("max: " + Collections.max(ll));
    }
}
