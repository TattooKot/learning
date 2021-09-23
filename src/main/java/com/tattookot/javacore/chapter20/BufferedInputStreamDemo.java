package main.java.com.tattookot.javacore.chapter20;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
    public static void main(String[] args) {
        String s = "This is copyrighting symbol &copy; , a &copy - no";
        byte[] byf = s.getBytes();

        ByteArrayInputStream in = new ByteArrayInputStream(byf);
        int c;
        boolean mark = false;

        try(BufferedInputStream f = new BufferedInputStream(in)){
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
