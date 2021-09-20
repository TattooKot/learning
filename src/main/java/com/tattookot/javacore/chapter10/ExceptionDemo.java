package main.java.com.tattookot.javacore.chapter10;

class MyException extends Exception{
    int details;

    public MyException(int details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "MyException [" + details + ']';
    }
}

public class ExceptionDemo {
    static void compute(int i) throws MyException {
        System.out.println("Method compute called");

        if(i > 10)
            throw new MyException(i);
        System.out.println("Well done");
    }

    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        } catch (MyException e) {
            System.out.println("Exception cached: " + e);
        }
    }
}
