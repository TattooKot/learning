package main.java.com.tattookot.javacore.chapter15;

interface StringFunc{
    String func(String str);
}

public class BlockLambdaDemo2 {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
          String result = "";

          for(int i = str.length()-1; i>=0; i--)
              result += str.charAt(i);

          return result;
        };

        System.out.println("Test reversed: " + reverse.func("Test"));
        System.out.println("Java reversed: " + reverse.func("Java"));
    }
}
