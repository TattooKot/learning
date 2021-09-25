package main.java.com.tattookot.javacore.chapter22;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest  {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host);

        host = InetAddress.getByName("www.herbschildt.com");
        System.out.println(host);

        InetAddress[] SW = InetAddress.getAllByName("www.nba.com");
        for (InetAddress inetAddress : SW) System.out.println(inetAddress);
    }
}
