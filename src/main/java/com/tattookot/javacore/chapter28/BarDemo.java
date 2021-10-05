package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class BarDemo {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(3, new Thread(() -> System.out.println("Bar done")));

        System.out.println("Main thread started");
        new MyThread1(barrier, "A");
        new MyThread1(barrier, "B");
        new MyThread1(barrier, "C");
        new MyThread1(barrier, "x");
        new MyThread1(barrier, "y");
        new MyThread1(barrier, "z");
    }
}

class MyThread1 implements Runnable{
    CyclicBarrier barrier;
    String name;

    public MyThread1(CyclicBarrier barrier, String name) {
        this.barrier = barrier;
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name);
        try {
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}