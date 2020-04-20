package myhttp;

import java.net.URL;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class MyHTTPRequest {
    private String url;
    private String method;
    private String result;
    private String authenticationMethod;
    private JsonPayload payload;
    private String userPass;
    public MyHTTPRequest(){
    }
    public MyHTTPRequest(String url, String method){
        this.url = url;
        this.method = method;
    }
    public MyHTTPRequest(String url, String method, String user, String password) {
        this.url = url;
        this.method = method;
    }

    public String get(){
        String res = "";
        try {
            res = get(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    private String get(String url) throws IOException {
        HttpGet request = new HttpGet(url);

        CredentialsProvider credentials = new BasicAuth(getUser(userPass),getPass(userPass)).getCreds();

        CloseableHttpClient httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(credentials)
                .build();
        try {
             CloseableHttpResponse response = httpClient.execute(request);

             try {
            // 401 if wrong user/password
            System.out.println(response.getStatusLine().getStatusCode());

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // return it as a String
                result = EntityUtils.toString(entity);
                System.out.println(result);
            }
             } finally {
                 response.close();
             }
        } finally {
            httpClient.close();
        }
        return result;
    }

    private String getUser(String userPass){
        return userPass.split(":")[0];
    }
    private String getPass(String userPass){
        return userPass.split(":")[1];
    }

    public JsonPayload getPayload() {
        return payload;
    }

    public void setPayload(JsonPayload payload) {
        this.payload = payload;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setAuthenticationMethod(String authn){
        this.authenticationMethod = authn;
    }
    public String getAuthenticationMethod(){
        return authenticationMethod;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }
}
