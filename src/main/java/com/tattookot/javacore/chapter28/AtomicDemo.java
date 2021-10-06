package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicDemo {
    public static void main(String[] args) {
        new AtomicThread("A");
        new AtomicThread("B");
        new AtomicThread("C");
    }
}

class SharedAtomic{
    static AtomicInteger ai = new AtomicInteger(0);
}

class AtomicThread implements Runnable{
    String name;

    public AtomicThread(String name) {
        this.name = name;
        new Thread(this).start();
    }

    @Override
    public void run() {
        System.out.println(name + " thread started");
        for(int i = 1; i<=3; i++){
            System.out.println("Thread " + name + " get " + SharedAtomic.ai.getAndSet(i));
        }
    }
}
