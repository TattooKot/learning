package main.java.com.tattookot.javacore.chapter18;

import java.util.*;

public class HTDemo {
    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();

        Enumeration<String> names;

        String str;
        Double bal;

        balance.put("Steve Jobs", 3434.34);
        balance.put("Natali Yedynak", 123.22);
        balance.put("Stas Kot", 1378.00);
        balance.put("Andriy Abramov", 99.22);
        balance.put("Sosige Bachinsky", -19.08);

        names = balance.keys();
        while(names.hasMoreElements()){
            str = names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        bal = balance.get("Steve Jobs");
        balance.put("Steve Jobs", bal+1000);
        System.out.println("new balance: " + balance.get("Steve Jobs"));

    }
}