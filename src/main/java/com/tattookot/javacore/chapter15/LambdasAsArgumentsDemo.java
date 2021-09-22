package main.java.com.tattookot.javacore.chapter15;

interface StringFunction{
    String func(String n);
}

public class LambdasAsArgumentsDemo {

    static String stringOp(StringFunction sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {

        String inStr = "Lambdas is good for java";
        String outStr;

        System.out.println("inStr: " + inStr);

        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("UpperCase string: " + outStr);

        outStr = stringOp((str) ->{
            String result = "";

            for(int i = 0; i<str.length(); i++)
                if(str.charAt(i) != ' ') result += str.charAt(i);

            return result;
        }, inStr );


        System.out.println("String without spaces: " + outStr);

        StringFunction reverse = (str) -> {
            String result = "";

            for(int i = str.length()-1; i>=0; i--)
                result += str.charAt(i);

            return result;
        };

        System.out.println("Reversed string: " + stringOp(reverse, inStr));
    }
}
