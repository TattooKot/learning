package main.java.com.tattookot.javacore.chapter18;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>(3,2);
        System.out.println("vector`s size: " + vector.size());
        System.out.println("vector`s capacity: " + vector.capacity());

        vector.addElement(1);
        vector.addElement(2);
        vector.addElement(3);
        vector.addElement(4);

        System.out.println("vector`s capacity after adding elements: " + vector.capacity());

        vector.addElement(5);
        System.out.println("current vectors capacity: " + vector.capacity());

        vector.addElement(6);
        vector.addElement(7);
        System.out.println("current vectors capacity: " + vector.capacity());

        vector.addElement(9);
        vector.addElement(10);
        System.out.println("current vectors capacity: " + vector.capacity());

        vector.addElement(11);
        vector.addElement(12);

        System.out.println("first: " + vector.firstElement());
        System.out.println("last: " + vector.lastElement());

        if(vector.contains(3)) System.out.println("vector contains 3");

        Enumeration<Integer> vEnum = vector.elements();

        System.out.println("vector`s elements: ");
        while (vEnum.hasMoreElements())
            System.out.print(vEnum.nextElement() + " ");

        //Для перебору також можна використовувати ітератор або цикл фор

    }
}
