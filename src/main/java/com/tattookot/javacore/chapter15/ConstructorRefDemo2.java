package main.java.com.tattookot.javacore.chapter15;

interface MyF2<T> {
    MyClass2<T> func(int v);
}

class MyClass2<T> {
    T value;

    public MyClass2() {
        this.value = null;
    }

    public MyClass2(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class ConstructorRefDemo2 {
    public static void main(String[] args) {
        MyF2<Integer> mf = MyClass2::new;

        MyClass2<Integer> mc = mf.func(100);

        System.out.println("mc value: " + mc.getValue());
    }
}
