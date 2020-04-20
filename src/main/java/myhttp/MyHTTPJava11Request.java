package myhttp;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class MyHTTPJava11Request {
    private final HttpClient httpClient = HttpClient.newBuilder()
            .version(HttpClient.Version.HTTP_2)
            .build();

    public static String url = "";

    public MyHTTPJava11Request(String url){
        this.url = url;
    }

    public static String myHttpRequest(String url) throws IOException, InterruptedException {
        MyHTTPJava11Request obj = new MyHTTPJava11Request(url);
        return obj.sendGET();
    }

    private String sendGET() throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create(url))
                .setHeader("User-Agent", "Java 11 HttpClient Bot") // add request header
                .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        // print response headers
        HttpHeaders headers = response.headers();
        //headers.map().forEach((k, v) -> System.out.println(k + ":" + v));

        // print status code
        int responseCode = response.statusCode();

        // print response body
        return response.body();
    }

}
