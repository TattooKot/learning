package main.java.com.tattookot.javacore.chapter14;

class Ge<T>{
    T ob;

    public Ge(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }
}

class G4<T> extends Ge<T>{
    public G4(T ob) {
        super(ob);
    }
}

public class HeirDemo3 {
    public static void main(String[] args) {
        G4<Integer> o1 = new G4<>(12);
        G4<Integer> o2 = new G4<>(12);
        G4<String> o3 = new G4<>("12");

        System.out.println("o1 instance od g4: " + (o1 instanceof G4<?>));
        System.out.println("o1 instance od ge: " + (o1 instanceof Ge<?>));
        System.out.println("o2 instance od g4: " + (o2 instanceof G4<?>));
        System.out.println("o2 instance od ge: " + (o2 instanceof Ge<?>));
        System.out.println("o3 instance od g4: " + (o3 instanceof G4<?>));
        System.out.println("o3 instance od ge: " + (o3 instanceof Ge<?>));

    }
}
