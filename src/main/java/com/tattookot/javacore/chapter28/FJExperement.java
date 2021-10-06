package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Transform extends RecursiveAction {
    final int seqThreshold;
    double[] data;
    int start, end;

    public Transform(int seqThreshold, double[] data, int start, int end) {
        this.seqThreshold = seqThreshold;
        this.data = data;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if((end-start)<seqThreshold){
            for(int i = start; i<end; i++){
                if(data[i] % 2 == 0) {
                    data[i] = Math.sqrt(data[i]);
                } else {
                    data[i] = Math.cbrt(data[i]);
                }
            }
        } else {
            int middle = (start+end)/2;
            invokeAll(new Transform(seqThreshold, data, start, middle),
                    new Transform(seqThreshold, data, middle, end));
        }
    }
}

public class FJExperement {
    public static void main(String[] args) {

        int pLevel;
        int threshold;

        if(args.length < 2){
            System.out.println("Write parameters for start");
            return;
        }

        pLevel = Integer.parseInt(args[0]);
        threshold = Integer.parseInt(args[1]);

        long beginT,endT;

        ForkJoinPool pool = new ForkJoinPool(pLevel);

        double[] nums = new double[1000000];
        for(int i = 0; i<nums.length; i++){
            nums[i] = i;
        }

        Transform task = new Transform(threshold,nums,0,nums.length);

        beginT = System.nanoTime();

        pool.invoke(task);

        endT = System.nanoTime();

        System.out.println("pLevel: " + pLevel);
        System.out.println("threshold: " + threshold);
        System.out.println("time: " + (endT-beginT));
    }
}
