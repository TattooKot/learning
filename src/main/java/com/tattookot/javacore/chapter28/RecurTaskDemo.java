package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SumDouble extends RecursiveTask<Double>{
    final int seqThreshold = 500;
    double[] data;
    int start;
    int end;

    public SumDouble(double[] data, int start, int end) {
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Double compute() {
        double sum = 0;

        if((end - start) < seqThreshold){
            for(int i = start; i<end; i++){
                sum += data[i];
            }
        }else {
            int middle = (start + end)/2;
            SumDouble subTask1 = new SumDouble(data,start,middle);
            SumDouble subTask2 = new SumDouble(data,middle,end);

            subTask1.fork();
            subTask2.fork();

            sum = subTask1.join() + subTask2.join();
        }
        return  sum;
    }
}

public class RecurTaskDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        double[] data = new double[5000];
        for(int i = 0; i<data.length; i++){
            data[i] = i%2 == 0 ? i : -i;
        }

        SumDouble task = new SumDouble(data, 0, data.length);
        double result = pool.invoke(task);
        System.out.println("Sum: " + result);
    }
}
