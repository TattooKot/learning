package main.java.com.tattookot.javacore.chapter18;

import java.util.ArrayList;
import java.util.Spliterator;

public class SplitIteratorDemo {
    public static void main(String[] args) {

        ArrayList<Double> vals = new ArrayList<>();

        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        System.out.println("vals: ");
        Spliterator<Double> splititr = vals.spliterator();
        while(splititr.tryAdvance((n) -> System.out.println(n)));

        splititr = vals.spliterator();
        ArrayList<Double> sqrt = new ArrayList<>();
        while(splititr.tryAdvance((n) -> sqrt.add(Math.sqrt(n))));
        System.out.println();

        System.out.println("sqrt: ");
        splititr = sqrt.spliterator();
        splititr.forEachRemaining((n) -> System.out.println(n));

    }
}
