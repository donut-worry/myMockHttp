package myhttp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class HTTPDriver {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://jsonmock.hackerrank.com/api/article_users?page=1";
        String jsonResponse = MyHTTPRequest.myHttpRequest(url);
        System.out.println("Response : ");
        System.out.println(jsonResponse);

        // Create Jackson ObjectMapper Object
        ObjectMapper mapper = new ObjectMapper();

        JsonResponse obj = mapper.readValue(jsonResponse, JsonResponse.class);

        System.out.println(obj);
    }
}
