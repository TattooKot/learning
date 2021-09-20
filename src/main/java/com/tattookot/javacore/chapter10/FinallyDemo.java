package main.java.com.tattookot.javacore.chapter10;

public class FinallyDemo {
    static void procA(){
        try{
            System.out.println("Inside procA");
            throw new RuntimeException("Demonstration");
        } finally{
            System.out.println("Finally in procA");
        }
    }

    static void procB(){
        try{
            System.out.println("Inside procB");
            return;
        }finally {
            System.out.println("procB finally");
        }
    }

    static void procC(){
        try{
            System.out.println("Inside procC");
        }finally {
            System.out.println("procC finally");
        }
    }

    public static void main(String[] args) {
        try{
            procA();
        } catch (Exception e){
            System.out.println("Exception cached");
        }

        procB();
        procC();
    }
}
