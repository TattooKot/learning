package main.java.com.tattookot.javacore.chapter13;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

// or:
// import static java.lang.Math.*;

public class Hypot2 {
    public static void main(String[] args) {
        double side1, side2, hypot;
        side1 = 3.0;
        side2 = 4.0;

        hypot = sqrt(pow(side1, 2) + pow(side2, 2));

        System.out.println("hypot: " + hypot);
    }
}
