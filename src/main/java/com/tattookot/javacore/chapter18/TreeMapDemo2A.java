package main.java.com.tattookot.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2A {
    public static void main(String[] args) {

        CompLastNames cln = new CompLastNames();
        Comparator<String> CompLastThenFirst = cln.thenComparing(new CompThenByFirstNames());

        TreeMap<String, Double> hm = new TreeMap<>(CompLastThenFirst);

        hm.put("Kolia Pisun", 3434.34);
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
        double balance = hm.get("Kolia Pisun");
        hm.put("Kolia Pisun", balance + 1000);
        System.out.println("New balance for 'Kolia Pisun': " + hm.get("Kolia Pisun"));
    }
}

class CompLastNames implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        int x,y,z;

        x = o1.lastIndexOf(' ');
        y = o2.lastIndexOf(' ');
        return o1.substring(x).compareToIgnoreCase(o2.substring(y));

    }
}

class CompThenByFirstNames implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}

/*

 */