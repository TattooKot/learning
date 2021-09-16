package main.java.com.tattookot.javacore.chapter18;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = new int[10];
        for(int i = 0; i<array.length; i++)
            array[i] = -3 * i;

        System.out.print("array before sort: ");
        display(array);

        Arrays.sort(array);

        System.out.print("array after sort: ");
        display(array);

        Arrays.fill(array,2,6,-1);

        System.out.print("array after fill method: ");
        display(array);

        Arrays.sort(array);
        System.out.print("Sorted array after fill method: ");
        display(array);

        int index = Arrays.binarySearch(array, -9);

        System.out.println("-9 index in array: " + index);
    }

    public static void display(int[] array){
        for(int i : array)
            System.out.print(i + " ");
        System.out.println();
    }
}
