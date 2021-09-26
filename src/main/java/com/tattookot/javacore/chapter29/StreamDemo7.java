package main.java.com.tattookot.javacore.chapter29;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class NamePhoneEmail1{
    String name;
    String number;
    String email;

    public NamePhoneEmail1(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }
}

class NamePhone1{
    String name;
    String number;

    public NamePhone1(String name, String number) {
        this.name = name;
        this.number = number;
    }
}

public class StreamDemo7 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail1> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail1("Name1", "Phone1", "Email1"));
        myList.add(new NamePhoneEmail1("Name2", "Phone2", "Email2"));
        myList.add(new NamePhoneEmail1("Name3", "Phone3", "Email3"));

        Stream<NamePhone1> namePhoneStream = myList.stream().map(a -> new NamePhone1(a.name, a.number));
        System.out.print("NamePhone1: \n");
        namePhoneStream.forEach(a -> System.out.print(a.name + " " + a.number + "\n"));
        System.out.println();

        namePhoneStream = myList.stream().map(a -> new NamePhone1(a.name, a.number));
        List<NamePhone1> list = namePhoneStream.collect(Collectors.toList());
        System.out.println("NamePhone from list: ");
        list.forEach(e -> System.out.println(e.name + " " + e.number));
        System.out.println();


        namePhoneStream = myList.stream().map(a -> new NamePhone1(a.name, a.number));
        Set<NamePhone1> set = namePhoneStream.collect(Collectors.toSet());
        System.out.println("NamePhone from set: ");
        set.forEach(e -> System.out.println(e.name + " " + e.number));
    }
}
