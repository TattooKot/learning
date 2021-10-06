package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new LockThread("A", lock);
        new LockThread("B", lock);
    }
}

class SharedClass{
    static int count = 0;
}

class LockThread implements Runnable{
    String name;
    ReentrantLock lock;

    public LockThread(String name, ReentrantLock lock) {
        this.name = name;
        this.lock = lock;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name + " thread started");

        try {
            System.out.println(name + " is waiting for blocking count");
            lock.lock();
            System.out.println(name + " is blocking count");
            SharedClass.count++;
            System.out.println(name + ": " + SharedClass.count);
            System.out.println(name + " waiting");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(name + " is unlocking count");
            lock.unlock();
        }
    }
}
