package myhttp;

import java.io.UnsupportedEncodingException;
import java.net.URL;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.sql.SQLOutput;

public class MyHTTPRequest {
    private String url;
    private String method;
    private String result;
    private String authenticationMethod;
    private String payload;
    private String userPass;
    private CloseableHttpClient httpClient;
    private CredentialsProvider credentials;
    private MyHttpResponse httpResponse = new MyHttpResponse();
    public MyHTTPRequest(){
    }
    public MyHTTPRequest(String url, String method, String userPass) {
        this.url = url;
        this.method = method;
        this.userPass = userPass;
    }

    public MyHttpResponse get(){
        MyHttpResponse res = null;
        try {
            res = get(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    public MyHttpResponse post(){
        MyHttpResponse res = null;
        try {
            res = post(url,payload);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    public MyHttpResponse put(){
        MyHttpResponse res = null;
        try {
            res = put(url,payload);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    public MyHttpResponse delete(){
        MyHttpResponse res = null;
        try {
            res = delete(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }
    private MyHttpResponse get(String url) throws IOException {
        HttpGet request = new HttpGet(url);
        connectionInit();
        try {
             CloseableHttpResponse response = httpClient.execute(request);

             try {
            // 401 if wrong user/password
                 httpResponse.responseCode = response.getStatusLine().getStatusCode();

            HttpEntity entity = response.getEntity();
            if (entity != null) {
                // return it as a String
                httpResponse.responseBody = EntityUtils.toString(entity);
                //System.out.println(result);
            } else {
                httpResponse.responseBody = "";
            }
             } finally {
                 response.close();
             }
        } finally {
            httpClient.close();
        }
        return httpResponse;
    }

    private MyHttpResponse post(String url,String payload) throws IOException {
        String result = "";
        HttpPost post = new HttpPost(url);
        CloseableHttpResponse response;
        connectionInit();
        try {
            // send a JSON data
            try {
                post.addHeader(HttpHeaders.CONTENT_TYPE, "application/json");
                post.setEntity(new StringEntity(payload));
            } catch (UnsupportedEncodingException e) {
                System.out.println("payload count not be converted to StringEntity : " + payload);
                e.printStackTrace();
            }
            response = httpClient.execute(post);
            try {
                httpResponse.responseCode = response.getStatusLine().getStatusCode();
                httpResponse.responseBody = EntityUtils.toString(response.getEntity());

            } finally {
                response.close();
            }
        } finally { httpClient.close(); }
        return httpResponse;
    }

    private MyHttpResponse put(String url,String payload) throws IOException {
        String result = "";
        HttpPut put = new HttpPut(url);
        CloseableHttpResponse response;
        connectionInit();
        try {
            // send data (as text)
            try {
                put.setEntity(new StringEntity(payload));
            } catch (UnsupportedEncodingException e) {
                System.out.println("payload count not be converted to StringEntity : " + payload);
                e.printStackTrace();
            }
            response = httpClient.execute(put);
            try {
                httpResponse.responseCode = response.getStatusLine().getStatusCode();
                if(httpResponse.responseCode == 204) // typically while updating existing document
                    httpResponse.responseBody = "";
                else
                    httpResponse.responseBody = EntityUtils.toString(response.getEntity());

            } finally {
                response.close();
            }
        } finally { httpClient.close(); }
        return httpResponse;
    }

    private MyHttpResponse delete(String url) throws IOException {
        HttpDelete request = new HttpDelete(url);
        connectionInit();
        try {
            CloseableHttpResponse response = httpClient.execute(request);

            try {
                // 401 if wrong user/password
                httpResponse.responseCode = response.getStatusLine().getStatusCode();
                HttpEntity entity = response.getEntity();
                if (entity != null) {
                    // return it as a String
                    httpResponse.responseBody = EntityUtils.toString(entity);
                    System.out.println(result);
                } else {
                    httpResponse.responseBody = "";
                }
            } finally {
                response.close();
            }
        } finally {
            httpClient.close();
        }
        return httpResponse;
    }

    private void connectionInit(){
        credentials = new BasicAuth(getUser(userPass),getPass(userPass)).getCreds();
        httpClient = HttpClientBuilder.create()
                .setDefaultCredentialsProvider(credentials)
                .build();
    }

    private String getUser(String userPass){
        return userPass.split(":")[0];
    }
    private String getPass(String userPass){
        return userPass.split(":")[1];
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
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
