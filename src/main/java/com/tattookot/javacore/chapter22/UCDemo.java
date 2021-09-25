package main.java.com.tattookot.javacore.chapter22;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class UCDemo {
    public static void main(String[] args) throws Exception {
        int c;
        URL url = new URL("http://www.internic.net");
        URLConnection connection = url.openConnection();

        long d = connection.getDate();
        System.out.println(d==0 ? "Date not found" : "Date: " + new Date(d));

        System.out.println("Content type: " + connection.getContentType());

        d = connection.getExpiration();
        System.out.println(d==0 ? "Date not found" : "Exp: " + new Date(d));

        d = connection.getLastModified();
        System.out.println(d==0 ? "Date not found" : "Last modified: " + new Date(d));

        long len = connection.getContentLengthLong();
        System.out.println(len == -1 ? "Length not found" : "Length: " + new Date(d));

        if(len != -1){
            System.out.println("===Content===");
            InputStream in = connection.getInputStream();
            while((c = in.read()) != -1) System.out.print((char) c);
        } else System.out.println("Content not found");




    }
}
