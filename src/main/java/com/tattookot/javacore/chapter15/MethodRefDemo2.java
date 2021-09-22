package main.java.com.tattookot.javacore.chapter15;

interface StringFun2{
    String func(String n);
}

class MyStringOps2{

    String stringReverse(String str){
        String result = "";

        for(int i = str.length()-1; i>=0; i--)
            result += str.charAt(i);

        return result;
    }
}

public class MethodRefDemo2 {

    static String stringOp(StringFun sf, String s){
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Lambdas is good for java";
        String outStr;

        MyStringOps2 mso = new MyStringOps2();

        outStr = stringOp(mso::stringReverse, inStr);

        System.out.println("inStr: " + inStr);
        System.out.println("outStr: " + outStr);
    }

}
