package main.java.com.tattookot.javacore.chapter18;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>(new MyComp());

        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for(String s: ts)
            System.out.print(s + " ");

    }
}

class MyComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
