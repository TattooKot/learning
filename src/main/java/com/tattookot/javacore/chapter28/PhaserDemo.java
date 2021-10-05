package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.Phaser;

public class PhaserDemo {
    public static void main(String[] args) {
        Phaser phaser = new Phaser(1);
        int phase;

        System.out.println("Threads started");

        new MyThread2(phaser, "A");
        new MyThread2(phaser, "B");
        new MyThread2(phaser, "C");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " completed");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " completed");

        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Phase " + phase + " completed");

        phaser.arriveAndDeregister();

        if(phaser.isTerminated()){
            System.out.println("Done");
        }

    }
}

class MyThread2 implements Runnable{
    Phaser phaser;
    String name;

    public MyThread2(Phaser phaser, String name) {
        this.phaser = phaser;
        this.name = name;
        phaser.register();
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name + ": started phase first phase");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + ": second phase started");
        phaser.arriveAndAwaitAdvance();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(name + ": third phase started");
        phaser.arriveAndDeregister();
    }
}
