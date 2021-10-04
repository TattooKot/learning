package main.java.com.tattookot.javacore.chapter14;

import java.util.Arrays;
import java.util.Comparator;

interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}

class MyClass<T extends Comparable<T>> implements MinMax<T>{
    final T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }

    @Override
    public T min() {
        return Arrays.stream(vals).min(Comparator.naturalOrder()).orElse(null);
    }

    @Override
    public T max() {
        return Arrays.stream(vals).max(Comparator.naturalOrder()).orElse(null);
    }
}

public class GenIFDemo {
    public static void main(String[] args) {
        Integer[] nums = {1,2,3,4,5};
        Character[] chars = {'f','g','b','t'};

        System.out.println("Nums max: " + new MyClass<Integer>(nums).max());
        System.out.println("Nums min: " + new MyClass<Integer>(nums).min());

        System.out.println("Char max: " + new MyClass<Character>(chars).max());
        System.out.println("Char min: " + new MyClass<Character>(chars).min());
    }

}
