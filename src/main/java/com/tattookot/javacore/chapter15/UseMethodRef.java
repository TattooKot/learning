package main.java.com.tattookot.javacore.chapter15;

import java.util.ArrayList;
import java.util.Collections;

class MyClass{
    int value;

    public MyClass(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class UseMethodRef {
    static int compareMC(MyClass a, MyClass b){
        return a.getValue()-b.getValue();
    }

    public static void main(String[] args) {
        ArrayList<MyClass> al = new ArrayList<>();

        al.add(new MyClass(1));
        al.add(new MyClass(2));
        al.add(new MyClass(3));
        al.add(new MyClass(4));
        al.add(new MyClass(7));
        al.add(new MyClass(9));

        MyClass maxValObj = Collections.max(al, UseMethodRef::compareMC);
        System.out.println("Max value: " + maxValObj.value);
    }
}
