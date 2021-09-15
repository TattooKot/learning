package main.java.com.tattookot.javacore.chapter18;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {

        LinkedList<Address> ml = new LinkedList<>();

        ml.add(new Address("Name 1", "Street 1", "City 1", "State 1", "code 1"));
        ml.add(new Address("Name 2", "Street 2", "City 2", "State 2", "code 2"));
        ml.add(new Address("Name 3", "Street 3", "City 3", "State 3", "code 3"));

        for(Address address : ml)
            System.out.println(address);

    }
}

class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
