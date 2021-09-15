package main.java.com.tattookot.javacore.chapter18;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Double> hm = new HashMap<>();

        hm.put("Name 1", 3434.34);
        hm.put("Name 2", 123.22);
        hm.put("Name 3", 1378.00);
        hm.put("Name 4", 99.22);
        hm.put("Name 5", -19.08);

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for(Map.Entry<String, Double> me : set){
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }

        System.out.println();
        double balance = hm.get("Name 1");
        hm.put("Name 1", balance + 1000);
        System.out.println("New balance for 'Name 1': " + hm.get("Name 1"));
    }
}