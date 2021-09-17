package main.java.com.tattookot.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2B {
    public static void main(String[] args) {


        Comparator<String> ln = (str1, str2) ->  str1.substring(str1.lastIndexOf(' ')).compareToIgnoreCase(str2.substring(str2.lastIndexOf(' ')));
        Comparator<String> fn = (str1, str2) -> str1.compareToIgnoreCase(str2);


        TreeMap<String, Double> hm = new TreeMap<>(ln.thenComparing(fn));

        hm.put("Steve Jobs", 3434.34);
        hm.put("Natali Yedynak", 123.22);
        hm.put("Stas Kot", 1378.00);
        hm.put("Andriy Abramov", 99.22);
        hm.put("Sosige Bachinsky", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();
        double balance = hm.get("Steve Jobs");
        hm.put("Steve Jobs", balance + 1000);
        System.out.println("New balance for 'Steve Jobs': " + hm.get("Steve Jobs"));
    }
}