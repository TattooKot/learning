package main.java.com.tattookot.javacore.chapter14;

class GenO1<T>{
    T ob;

    public GenO1(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        System.out.println("Hello from parent method");
        return ob;
    }
}

class GenO2<T> extends GenO1<T>{
    public GenO2(T ob) {
        super(ob);
    }

    @Override
    public T getOb() {
        System.out.println("Hello from override method");
        return ob;
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        GenO1<Integer> o1 = new GenO1<>(12);
        GenO2<Integer> o2 = new GenO2<>(12);
        GenO2<String> o3 = new GenO2<>("12");
        o1.getOb();
        o2.getOb();
        o3.getOb();


    }
}
