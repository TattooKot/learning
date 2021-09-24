package main.java.com.tattookot.javacore.chapter20;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.IOException;

public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s = "This is copyrighting symbol &copy; , a &copy - no";
        char[] buf = new char[s.length()];
        s.getChars(0, s.length(), buf, 0);

        CharArrayReader in = new CharArrayReader(buf);
        int c;
        boolean mark = false;

        try(BufferedReader f = new BufferedReader(in)){
            while ((c = f.read()) != -1){
                switch (c){
                    case '&':
                        if(!mark){
                            f.mark(32);
                            mark = true;
                        } else mark = false;
                        break;
                    case ';':
                        if(mark){
                            mark = false;
                            System.out.print("(c)");
                        } else System.out.print((char) c);
                        break;
                    case ' ':
                        if(mark){
                            mark = false;
                            f.reset();
                            System.out.print("&");
                        } else System.out.print((char) c);
                        break;
                    default:
                        if(!mark) System.out.print((char) c);
                }
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
