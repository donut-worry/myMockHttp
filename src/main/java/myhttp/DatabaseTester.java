package myhttp;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class DatabaseTester {
    private String serverUrl;
    private int serverPort;
    private boolean isSsl;
    private String authenticationMethod;
    private String user;
    private String passwd;
    //private final String serverPort = "8002";
    private MyHTTPRequest req;
    ObjectMapper mapper;

    public DatabaseTester(String serverUrl){
        this.serverUrl = serverUrl;
        this.serverPort = 8003;
        this.isSsl = false;
        this.authenticationMethod = "Basic";
        this.user = "admin";
        this.passwd = "admin";
        init();
    }
    public DatabaseTester(String serverUrl, int serverPort, boolean isSsl,
                          String authMethod, String user, String passwd){
        this.serverUrl = serverUrl;
        this.serverPort = serverPort;
        this.isSsl = isSsl;
        this.authenticationMethod = authMethod;
        this.user = user;
        this.passwd = passwd;
        init();
    }

    private void init(){
        req = new MyHTTPRequest();
        req.setAuthenticationMethod(authenticationMethod);
        req.setUserPass(user + ":" + passwd);
        mapper = new ObjectMapper();
    }

    public int createDB(String dbName){
        String endPoint = "/manage/v2/databases";
        String queryString = "format=json";
        String jsonString = null;
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        PayloadCreateDB payload = new PayloadCreateDB();
        payload.setDatabaseName(dbName);
        try {
            jsonString = mapper.writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        req.setPayload(jsonString);
        return req.post().responseCode;
    }

    public int createForest(String forestName,String dbName){
        String endPoint = "/manage/v2/forests";
        String queryString = "format=json&wait-for-forest-to-mount=true";
        String jsonString = null;
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        PayloadCreateForest payload = new PayloadCreateForest();
        payload.setForestName(forestName);
        payload.setDatabase(dbName);
        try {
            jsonString = mapper.writeValueAsString(payload);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        req.setPayload(jsonString);
        //req.setPayload("{\"forest-name\":\"" + forestName + "\",\"database\":\"" + dbName + "\"}");
        return req.post().responseCode;
    }

    public int deleteDbForest(String dbName){
        String endPoint = "/manage/v2/databases/" + dbName;
        String queryString = "format=json&forest-delete=data";
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        //req.setPayload("{\"forest-name\":\"" + forestName + "\",\"database\":\"" + dbName + "\"}");
        return req.delete().responseCode;
    }

    public int insertDocument(String uri,String dbName){
        String endPoint = "/v1/documents";
        String queryString = "uri=" + uri + "&database=" + dbName;
        String jsonString = null;
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        SampleDocument doc = new SampleDocument();
        doc.setDocName(uri);
        doc.setCount("100");
        doc.setNote("This is a sample test document");
        try {
            jsonString = mapper.writeValueAsString(doc);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        req.setPayload(jsonString);
        return req.put().responseCode;
    }

    public int deleteDocument(String uri,String dbName){
        String endPoint = "/v1/documents";
        String queryString = "uri=" + uri + "&database=" + dbName;
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        return req.delete().responseCode;
    }

    public ResponseSearch runSearchQuery(String searchString,String dbName){
        ResponseSearch searchResponse = null;
        String endPoint = "/v1/search";
        String queryString = "q=" + searchString + "&database=" + dbName + "&format=json";
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        System.out.println("Search query url : " + url);
        req.setUrl(url);
        String responseBody = req.get().responseBody;
        try {
            searchResponse = mapper.readValue(responseBody, ResponseSearch.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return responseBody;
        return searchResponse;
    }

    public ResponseDatabaseCounts getDbCounts(String dbName){
        ResponseDatabaseCounts dbCounts = null;
        String endPoint = "/manage/v2/databases/" + dbName;
        String queryString = "view=counts&format=json";
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        String responseBody = req.get().responseBody;
        try {
            dbCounts = mapper.readValue(responseBody, ResponseDatabaseCounts.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return responseBody;
        return dbCounts;
    }

    public ResponseDatabaseStatus getDbStatus(String dbName){
        ResponseDatabaseStatus dbCounts = null;
        String endPoint = "/manage/v2/databases/" + dbName;
        String queryString = "view=status&format=json";
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        String responseBody = req.get().responseBody;
        try {
            dbCounts = mapper.readValue(responseBody, ResponseDatabaseStatus.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return responseBody;
        return dbCounts;
    }

    public ResponseForestStatus getForestStatus(String forestName){
        ResponseForestStatus dbCounts = null;
        String endPoint = "/manage/v2/forests/" + forestName;
        String queryString = "view=status&format=json";
        String url = constructUrl(serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        String responseBody = req.get().responseBody;
        try {
            dbCounts = mapper.readValue(responseBody, ResponseForestStatus.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //return responseBody;
        return dbCounts;
    }


    // Create Jackson ObjectMapper Object
    //ObjectMapper mapper = new ObjectMapper();

    //JsonResponse obj = mapper.readValue(jsonResponse, JsonResponse.class);

    //System.out.println(obj);

    private String constructUrl(String serverUrl,
                                int serverPort,
                                String endPoint,
                                String queryString
                                ){
        StringBuilder url = new StringBuilder();
        url.append((isSsl)?"https://":"http://");
        url.append(serverUrl);
        url.append(":");
        url.append(serverPort);
        url.append(endPoint);
        url.append("?");
        url.append(queryString);
        return url.toString();
    }

    public void setServerUrl(String serverUrl){
        this.serverUrl = serverUrl;
    }
    public String getServerUrl(){
        return serverUrl;
    }


}
