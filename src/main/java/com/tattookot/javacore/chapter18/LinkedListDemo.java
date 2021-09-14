package main.java.com.tattookot.javacore.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> ll = new LinkedList<>();

        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.add("C");
        ll.add("Z");
        ll.addFirst("A");
        ll.add(1,"A2");

        System.out.println("ll: " + ll);

        ll.remove("F");
        ll.remove(2);
        System.out.println("ll after removing elements: " + ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println("ll after  removing first and last elements: " + ll);

        String value = ll.get(2);
        ll.set(2, value + " changed");
        System.out.println("ll after changes " + ll);

        /*

        Исходное содержимое связного списка 1 1 : [А, А2 , F, в , D, Е, С, Z)
        Содержимое связного списка 11 после удаления элементов : [А, А2 , D, Е, с ,
        Содержимое связного списка 11 после удаления первого и последнего
        элементов : [А2 , D , Е, С]
        Содержимое связного списка 11 после изменения : [ А2, D, Е изменено , С]

         */
    }
}
