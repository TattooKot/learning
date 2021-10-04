package main.java.com.tattookot.javacore.chapter14;

class GenCons{
    private final double val;

    public <T extends Number>GenCons(T val) {
        this.val = val.doubleValue();
    }

    void showVal(){
        System.out.println("val: " + val);
    }

}

public class GenConsDemo {
    public static void main(String[] args) {
        GenCons test = new GenCons(100);
        GenCons test1 = new GenCons(131.0F);

        test.showVal();
        test1.showVal();
    }
}
