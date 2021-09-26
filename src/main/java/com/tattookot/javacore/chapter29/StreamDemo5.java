package main.java.com.tattookot.javacore.chapter29;

import java.util.ArrayList;
import java.util.stream.Stream;

class NamePhoneEmail{
    String name;
    String number;
    String email;

    public NamePhoneEmail(String name, String number, String email) {
        this.name = name;
        this.number = number;
        this.email = email;
    }
}
class NamePhone{
    String name;
    String number;

    public NamePhone(String name, String number) {
        this.name = name;
        this.number = number;
    }
}

public class StreamDemo5 {
    public static void main(String[] args) {
        ArrayList<NamePhoneEmail> myList = new ArrayList<>();
        myList.add(new NamePhoneEmail("Name1", "Phone1", "Email1"));
        myList.add(new NamePhoneEmail("Name2", "Phone2", "Email2"));
        myList.add(new NamePhoneEmail("Name3", "Phone3", "Email3"));

        System.out.print("NamePhoneNumber: \n");

        myList.forEach(a -> System.out.print(a.name + " " + a.number + " " + a.email + "\n"));
        System.out.println();

        Stream<NamePhone> namePhoneStream = myList.stream().map(a -> new NamePhone(a.name, a.number));
        System.out.print("NamePhone: \n");

        namePhoneStream.forEach(a -> System.out.print(a.name + " " + a.number + "\n"));
        System.out.println();

    }
}
