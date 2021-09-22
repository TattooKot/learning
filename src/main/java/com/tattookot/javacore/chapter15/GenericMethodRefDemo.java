package main.java.com.tattookot.javacore.chapter15;

interface MyFunc2<T>{
    int func(T[] value, T v);
}

class MyArrayOps{
    static <T> int countMatching(T[] vals, T v){
        int count = 0;

        for(T val : vals) if(val == v) count++;

        return count;
    }
}

public class GenericMethodRefDemo {
    static <T> int myOp(MyFunc2<T> f, T[] vals, T v){
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1,2,3,4,2,3,4,4,5};
        String [] strings = {"One", "Two", "Three", "Two"};

        int count;

        count = myOp(MyArrayOps::countMatching, vals, 2);
        System.out.println("Count 2 in vals: " + count);

        count = myOp(MyArrayOps::countMatching, strings, "Two");
        System.out.println("Count 'two' in strings: " + count);
    }

}
