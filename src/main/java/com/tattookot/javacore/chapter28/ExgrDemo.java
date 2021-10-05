package main.java.com.tattookot.javacore.chapter28;

import java.util.concurrent.Exchanger;

public class ExgrDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        new MakeString(exchanger);
        new UseString(exchanger);
    }
}

class MakeString implements Runnable{
    Exchanger<String> exchanger;
    String str;

    public MakeString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        this.str = "";
        new Thread(this).start();
    }


    @Override
    public void run() {
        char c = 'A';

        for(int i = 0; i<3; i++){
            for(int y = 0; y<5; y++){
                str += (char) c++;
            }
            try {
                str = exchanger.exchange(str);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class UseString implements Runnable{
    Exchanger<String> exchanger;
    String string;

    public UseString(Exchanger<String> exchanger) {
        this.exchanger = exchanger;
        string = "";
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i<3; i++) {
                string = exchanger.exchange("");
                System.out.println("Get from make string class: " + string);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
