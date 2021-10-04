package main.java.com.tattookot.javacore.chapter14;

import java.util.Arrays;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T> boolean isIn(T x, V[] y){
        return Arrays.asList(y).contains(x);
    }

    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        System.out.println("2: " + isIn(2,nums));
        System.out.println("7: " + isIn(7,nums));
        System.out.println();

        String[] strings = {"1", "2", "3", "4", "5"};
        System.out.println("2: " + isIn("2",strings));
        System.out.println("7: " + isIn("2",strings));
    }
}
