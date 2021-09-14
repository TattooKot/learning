package main.java.com.tattookot.javacore.chapter18;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        System.out.println("al size: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "А2") ;

        System.out.println("al size after adding elements:" + al.size());

        System.out.println("al: " + al);

        al.remove("F");
        al.remove(2);

        System.out.println("al size after removing elements: " + al.size());
        System.out.println("al: " + al);

        /*
        Начальный размер списочного массива al : О
        Размер списочного массива al после ввода элементов : 7
        Содержимое списочного массива a l : [С, А2. , А, Е, В, D, F]
        Размер списочного массива al после удаления элементов : 5
        Содержимое списочного массива al : [С, А2. , Е, В, D]
         */
    }
}
