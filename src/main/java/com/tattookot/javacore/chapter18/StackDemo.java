package main.java.com.tattookot.javacore.chapter18;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("stack: " + stack);

        showpush(stack, 42);
        showpush(stack, 66);
        showpush(stack, 99);
        showpop(stack);
        showpop(stack);
        showpop(stack);

        try{
            showpop(stack);
        }catch (EmptyStackException e){
            System.out.println("stack is empty");
        }

    }

    static void showpush(Stack<Integer> st, int n){
        st.push(n);
        System.out.println("push: (" + n + ")");
        System.out.println("stack st: " + st);
    }

    static void showpop(Stack<Integer> st){
        System.out.print("pop -> ");
        int a = st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);

    }
}
