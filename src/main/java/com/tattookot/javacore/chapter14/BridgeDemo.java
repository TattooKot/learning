package main.java.com.tattookot.javacore.chapter14;

class GenT<T>{
    T ob;

    public GenT(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class GenT1 extends GenT<String>{
    public GenT1(String ob) {
        super(ob);
    }

    @Override
    public String getOb(){
        System.out.println("Get ob from overriding method");
        return ob;
    }
}
public class BridgeDemo {
    public static void main(String[] args) {
        GenT1 g = new GenT1("Text in Gen1 class");
        g.getOb();
    }
}
