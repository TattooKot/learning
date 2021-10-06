package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.CountDownLatch;

public class CDLDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(5);
        System.out.println("Thread started");
        new MyThread(latch);
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread finished");
    }
}

class MyThread implements Runnable{
    CountDownLatch latch;

    public MyThread(CountDownLatch latch) {
        this.latch = latch;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(i);
            latch.countDown();
        }
    }
}
