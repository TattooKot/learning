package main.java.com.tattookot.javacore.chapter14;

class G<T>{
    T ob;

    public G(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class G2<T, V> extends G<T>{
    V ob2;

    public G2(T ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }
}
public class HeirDemo {
    public static void main(String[] args) {
        G2<String, Integer> g2 = new G2<>("Text", 11);
        System.out.println(g2.getOb());
        System.out.println(g2.getOb2());
    }
}
