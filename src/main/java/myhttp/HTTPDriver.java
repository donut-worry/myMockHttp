package myhttp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class HTTPDriver {
    public static void main(String[] args) throws IOException, InterruptedException {
        String url = "https://jsonmock.hackerrank.com/api/article_users?page=1";
        String url2 = "https://macpro-6021.marklogic.com:8002/manage/v2/databases/Documents?view=status&format=json";
        String jsonResponse = MyHTTPJava11Request.myHttpRequest(url);
        System.out.println("Response : ");
        System.out.println(jsonResponse);

        MyHTTPRequest req = new MyHTTPRequest();
        req.setAuthenticationMethod("Basic");
        req.setUserPass("admin:admin");
        req.setMethod("GET");
        req.setUrl(url2);

        String jsonResponse2 = req.get();
        System.out.println("Response2 : ");
        System.out.println(jsonResponse2);

        // Create Jackson ObjectMapper Object
        //ObjectMapper mapper = new ObjectMapper();

        //JsonResponse obj = mapper.readValue(jsonResponse, JsonResponse.class);

        //System.out.println(obj);
    }
}
