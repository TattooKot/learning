package main.java.com.tattookot.javacore.chapter14;

import java.util.Arrays;

class Stats1<T extends Number>{
    T[] nums;

    Stats1(T[] nums) {
        this.nums = nums;
    }
    
    double average(){
        return Arrays.stream(nums).mapToDouble(Number::doubleValue).sum() / nums.length;
    }

    boolean sameAvr(Stats1<?> ob){
        return this.average() == ob.average();
    }
    
}

public class WildcardDemo {
    public static void main(String[] args) {
        Integer[] i = {1,2,3,4,5};
        Stats1<Integer> sint = new Stats1<>(i);
        System.out.println("Average int: " + sint.average());

        Double[] d = {1.0,2.0,3.0,4.0,5.0};
        Stats1<Double> sdob = new Stats1<>(d);
        System.out.println("Average dob: " + sdob.average());

        Float[] f = {1.1F, 2.2F, 3.3F, 4.4F, 5.5F};
        Stats1<Float> sfl = new Stats1<>(f);
        System.out.println("Average float: " + sfl.average());

        System.out.println("Same int and dob: " + sint.sameAvr(sdob));
        System.out.println("Same float and dob: " + sfl.sameAvr(sdob));
    }
}
