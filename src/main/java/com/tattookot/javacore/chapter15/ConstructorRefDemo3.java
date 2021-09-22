package main.java.com.tattookot.javacore.chapter15;

interface MyF3<R, T> {
    R func(T n);
}

class MyClass3<T> {
    T value;

    public MyClass3(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

class MyClass4 {
    String value;

    public MyClass4(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

public class ConstructorRefDemo3 {

    static <R, T> R myClassFactory(MyF3<R, T> cons, T v) {
        return cons.func(v);
    }

    public static void main(String[] args) {
        MyF3<MyClass3<Double>, Double> d = MyClass3::new;

        MyClass3<Double> mc3 = myClassFactory(d, 100.0);
        System.out.println("mc3 val: " + mc3.getValue());

        MyF3<MyClass4,String> s = MyClass4::new;

        MyClass4 mc4 = myClassFactory(s, "strstr");
        System.out.println("mc4 sting: " + mc4.getValue());

    }
}
