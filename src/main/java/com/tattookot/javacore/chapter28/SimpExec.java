package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpExec {
    public static void main(String[] args) {
        CountDownLatch count = new CountDownLatch(5);
        CountDownLatch count2 = new CountDownLatch(5);
        CountDownLatch count3 = new CountDownLatch(5);
        CountDownLatch count4 = new CountDownLatch(5);
        ExecutorService service = Executors.newFixedThreadPool(2);

        System.out.println("Threads started");
        service.execute(new MT("A", count));
        service.execute(new MT("B", count2));
        service.execute(new MT("C", count3));
        service.execute(new MT("D", count4));

        try {
            count.await();
            count2.await();
            count3.await();
            count4.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println("Threads finished");
    }
}

class MT implements Runnable{
    String name;
    CountDownLatch latch;

    public MT(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
        new Thread(this);
    }

    @Override
    public void run() {
        for(int i = 0; i<5; i++){
            System.out.println(name + ": " + i);
            latch.countDown();
        }
    }
}
