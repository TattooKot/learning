package main.java.com.tattookot.javacore.chapter18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        System.out.print("al: ");

        Iterator<String> itr = al.iterator();

        while(itr.hasNext())
            System.out.print(itr.next() + " ");

        System.out.println();

        ListIterator<String> litr = al.listIterator();
        while(litr.hasNext())
            litr.set(litr.next() + "+ ");

        System.out.print("Changed al: ");

        itr = al.iterator();

        while(itr.hasNext())
            System.out.print(itr.next() + " ");

        System.out.println();

        System.out.print("Reversed al: ");

        while(litr.hasPrevious())
            System.out.print(litr.previous() + " ");

        System.out.println();
        /*
       Исходное· годержим,Jе списоч ного ма ссива a l : С 11 Е В D F'
        Модифицированно<> соде ржимое списочного ма ссива a l : С+ А+ Е+ В+ [J + r' f
        Модифи циро ван н ый в обратном порядке списо к : F+ О+ В+ Е+ А+ С+
         */
    }
}
