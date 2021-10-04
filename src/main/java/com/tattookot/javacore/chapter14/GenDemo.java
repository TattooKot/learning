package main.java.com.tattookot.javacore.chapter14;

class Gen<T>{
    T ob;

    Gen(T ob){
        this.ob = ob;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type: " + ob.getClass().getName());
    }
}

public class GenDemo {
    public static void main(String[] args) {
        Gen<Integer> intOb;
        intOb = new Gen<>(88);
        intOb.showType();
        int iOb = intOb.getOb();
        System.out.println("Value: " + iOb);

        Gen<String> strOb;
        strOb = new Gen<>("String");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("Value: " + s);


    }
}
