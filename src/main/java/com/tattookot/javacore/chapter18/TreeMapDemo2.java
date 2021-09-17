package main.java.com.tattookot.javacore.chapter18;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {

        TreeMap<String, Double> hm = new TreeMap<>(new TComp());

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

class TComp implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {

        int x,y,z;

        x = o1.lastIndexOf(' ');
        y = o2.lastIndexOf(' ');
        z = o1.substring(x).compareTo(o2.substring(y));

        if(z == 0) return o1.compareTo(o2);

        return z;
    }
}
