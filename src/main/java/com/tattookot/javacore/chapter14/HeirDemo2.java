package main.java.com.tattookot.javacore.chapter14;

class NonG{
    int ob;

    public NonG(int ob) {
        this.ob = ob;
    }

    public int getOb() {
        return ob;
    }
}

class G3<V> extends NonG{
    V ob2;

    public G3(int ob, V ob2) {
        super(ob);
        this.ob2 = ob2;
    }

    public V getOb2() {
        return ob2;
    }
}

public class HeirDemo2 {
    public static void main(String[] args) {
        G3<String> g3 = new G3<>(12, "Text");
        System.out.println(g3.getOb());
        System.out.println(g3.getOb2());
    }
}
