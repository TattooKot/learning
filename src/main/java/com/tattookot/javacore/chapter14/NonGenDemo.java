package main.java.com.tattookot.javacore.chapter14;

class NonGen{
    Object ob;

    NonGen(Object ob){
        this.ob = ob;
    }

    Object getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type: " + ob.getClass().getName());
    }
}

public class NonGenDemo {
    public static void main(String[] args) {
        NonGen intOb;
        intOb = new NonGen(88);
        intOb.showType();
        int iOb = (Integer) intOb.getOb();
        System.out.println("Value: " + iOb);

        NonGen strOb;
        strOb = new NonGen("String");
        strOb.showType();
        String s = (String) strOb.getOb();
        System.out.println("Value: " + s);


    }
}
