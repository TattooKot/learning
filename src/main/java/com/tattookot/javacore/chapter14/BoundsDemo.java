package main.java.com.tattookot.javacore.chapter14;

import java.util.Arrays;

class Stats<T extends Number>{
    T[] nums;

    Stats(T[] nums) {
        this.nums = nums;
    }
    
    double average(){
        return Arrays.stream(nums).mapToDouble(Number::doubleValue).sum() / nums.length;
    }
}

public class BoundsDemo {
    public static void main(String[] args) {
        Integer[] i = {1,2,3,4,5};
        Stats<Integer> sint = new Stats<>(i);
        System.out.println("Average int: " + sint.average());

        Double[] d = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> sdob = new Stats<>(d);
        System.out.println("Average dob: " + sdob.average());
    }
}
