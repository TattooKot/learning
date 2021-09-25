package main.java.com.tattookot.javacore.chapter22;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Whois {
    public static void main(String[] args) throws Exception{
        int c;
        try(Socket socket = new Socket("whois.internic.net", 43);
            InputStream in = socket.getInputStream();
            OutputStream out = socket.getOutputStream())
        {
            String str = (args.length == 0 ? "MHProfessional.com" : args[0]) + "\n";

            byte[] buf = str.getBytes();

            out.write(buf);

            while ((c = in.read()) != -1) System.out.print((char) c);
        }
    }
}
