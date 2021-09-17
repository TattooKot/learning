package main.java.com.tattookot.javacore.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;

public class HTDemo2 {
    public static void main(String[] args) {

        Hashtable<String, Double> balance = new Hashtable<>();

        Double bal;

        balance.put("Steve Jobs", 3434.34);
        balance.put("Natali Yedynak", 123.22);
        balance.put("Stas Kot", 1378.00);
        balance.put("Andriy Abramov", 99.22);
        balance.put("Sosige Bachinsky", -19.08);

        for(Map.Entry<String, Double> me : balance.entrySet())
            System.out.println(me.getKey() + ": " + me.getValue());
        System.out.println();

        bal = balance.get("Steve Jobs");
        balance.put("Steve Jobs", bal+1000);
        System.out.println("new balance: " + balance.get("Steve Jobs"));

    }
}