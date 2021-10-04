package main.java.com.tattookot.javacore.chapter14;

class TwoGen<T, V>{
    T ob1;
    V ob2;

    public TwoGen(T ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    T getOb1(){
        return ob1;
    }
    V getOb2(){
        return ob2;
    }

    void showTypes(){
        System.out.println("Type1: " + ob1.getClass().getName());
        System.out.println("Type2: " + ob2.getClass().getName());
    }
}

public class SimpGen {
    public static void main(String[] args) {
        TwoGen<Integer, String> tg = new TwoGen<>(88, "Text");
        tg.showTypes();
        int ob1 = tg.getOb1();
        System.out.println("Ob1: " + ob1);
        String ob2 = tg.getOb2();
        System.out.println("Ob2: " + ob2);
    }
}
