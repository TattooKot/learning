package main.java.com.tattookot.javacore.chapter18;

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        ArrayList<Integer> val = new ArrayList<>();

        val.add(1);
        val.add(2);
        val.add(3);
        val.add(4);
        val.add(5);

        System.out.print("val: ");

        for(int i : val)
            System.out.print(i + " ");

        System.out.println();

        int sum = 0;

        for(int i: val)
            sum += i;

        System.out.println("val sum: " + sum);

    }
}
