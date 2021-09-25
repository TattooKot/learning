package main.java.com.tattookot.javacore.chapter22;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HttpUrlDemo {
    public static void main(String[] args) throws Exception {
        URL url = new URL("http://www.google.com");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        System.out.println("Request method: " + connection.getRequestMethod());
        System.out.println("Response code: " + connection.getResponseCode());
        System.out.println("Response message: " + connection.getResponseMessage());
        Map<String, List<String>> headerMap = connection.getHeaderFields();
        Set<String> fields = headerMap.keySet();

        System.out.println("\nHeaders:");
        for(String k : fields) System.out.println("Key: " + k + "; Value: " + headerMap.get(k));
    }
}
