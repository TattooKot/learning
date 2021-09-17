package main.java.com.tattookot.javacore.chapter18;


import java.util.Properties;
import java.util.Set;

public class PropDemo2 {
    public static void main(String[] args) {

        Properties defList = new Properties();

        defList.put("Вісконсин", "Медісон");
        defList.put("Флорида", "Телесі");

        Properties prop = new Properties(defList);

        prop.put("Ілінойс", "Спрінгфілд");
        prop.put("Миссурі", "Джеферсон-Сіті");
        prop.put("Вашингтон", "Олімпія");
        prop.put("Каліфорнія", "Сакраменто");
        prop.put("Індіана", "Індіанаполіс");

        Set<?> states = prop.keySet();

        for(Object name : states)
            System.out.println("Столиця штату " + name + " - " + prop.getProperty((String) name));
        System.out.println();

        String str = prop.getProperty("Флорида");
        System.out.println("Столиця штату Флорида " + str);
    }
}
