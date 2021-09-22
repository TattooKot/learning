package main.java.com.tattookot.javacore.chapter15;

interface MyF{
    MyClass1 func(int v);
}

class MyClass1{
    int value;

    public MyClass1() {
        this.value = 0;
    }

    public MyClass1(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

public class ConstructorRefDemo {
    public static void main(String[] args) {
        MyF mf = MyClass1::new;

        MyClass1 mc = mf.func(100);

        System.out.println("mc value: " + mc.getValue());
    }
}
