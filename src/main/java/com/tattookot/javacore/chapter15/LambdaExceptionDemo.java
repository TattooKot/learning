package main.java.com.tattookot.javacore.chapter15;

interface DoubleNumericArrayFunc{
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception{
    public EmptyArrayException() {
        super("Array is empty");
    }
}

public class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        DoubleNumericArrayFunc average = (n) -> {
          double sum = 0;

          if(n.length == 0)
              throw new EmptyArrayException();

            for (double v : n) sum += v;

          return sum/n.length;
        };

        System.out.println("Average values: " + average.func(values));
        System.out.println("Average values: " + average.func(new double[0]));
    }
}
