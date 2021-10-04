package main.java.com.tattookot.javacore.chapter14;

class Gen1<T>{
    T ob;

    public T getOb() {
        return ob;
    }

    public Gen1(T ob) {
        this.ob = ob;
    }
}

public class RawDemo {
    public static void main(String[] args) {
        Gen1<Integer> integerGen1 = new Gen1<>(88);
        Gen1<String> stringGen1 = new Gen1<>("Text");
        Gen1 raw = new Gen1(12.1);
    }
}
