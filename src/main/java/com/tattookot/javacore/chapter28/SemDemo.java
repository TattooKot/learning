package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.Semaphore;

public class SemDemo {
    public static void main(String[] args) {
        Semaphore sem = new Semaphore(1);

        new IncThread("A", sem);
        new DecThread("B", sem);
    }
}

class Shared{
    static int count = 0;
}

class IncThread implements Runnable{
    String name;
    Semaphore semaphore;

    public IncThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting");
            semaphore.acquire();
            System.out.println(name + " connected to semaphore");

            for(int i = 0; i<5; i++){
                Shared.count++;
                System.out.println(name + ":" + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " disconnected from semaphore");
        semaphore.release();

    }
}

class DecThread implements Runnable{
    String name;
    Semaphore semaphore;

    public DecThread(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " waiting");
            semaphore.acquire();
            System.out.println(name + " connected to semaphore");

            for(int i = 0; i<5; i++){
                Shared.count--;
                System.out.println(name + ":" + Shared.count);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + " disconnected from semaphore");
        semaphore.release();

    }
}
