package main.java.com.tattookot.javacore.chapter18;


import java.util.*;

public class PropDemo {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.put("Ілінойс", "Спрінгфілд");
        prop.put("Миссурі", "Джеферсон-Сіті");
        prop.put("Вашингтон", "Олімпія");
        prop.put("Каліфорнія", "Сакраменто");
        prop.put("Індіана", "Індіанаполіс");

        Set<?> states = prop.keySet();

        for(Object name : states)
            System.out.println("Столиця штату " + name + " - " + prop.getProperty((String) name));
        System.out.println();

        String str = prop.getProperty("Флорида", "не знайдена");
        System.out.println("Столиця штату Флорида " + str);
    }
}
