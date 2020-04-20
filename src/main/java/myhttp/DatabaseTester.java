package myhttp;

public class DatabaseTester {
    private String serverUrl;
    private final String serverPort = "8002";
    private MyHTTPRequest req;

    public DatabaseTester(){
        init();
    }
    public DatabaseTester(String serverUrl){
        this.serverUrl = serverUrl;
        init();
    }
    private void init(){
        req = new MyHTTPRequest();
        req.setAuthenticationMethod("Basic");
        req.setUserPass("admin:admin");
    }

    public int createDB(String dbName){
        String endPoint = "/manage/v2/databases";
        String queryString = "format=json";
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        req.setPayload("{\"database-name\":\"" + dbName + "\"}");
        return req.post().responseCode;
    }
    public int createForest(String forestName,String dbName){
        String endPoint = "/manage/v2/forests";
        String queryString = "format=json&wait-for-forest-to-mount=true";
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        req.setPayload("{\"forest-name\":\"" + forestName + "\",\"database\":\"" + dbName + "\"}");
        return req.post().responseCode;
    }

    public int deleteDbForest(String dbName){
        String endPoint = "/manage/v2/databases/" + dbName;
        String queryString = "format=json&forest-delete=data";
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        //req.setPayload("{\"forest-name\":\"" + forestName + "\",\"database\":\"" + dbName + "\"}");
        return req.delete().responseCode;
    }

    public int insertDocument(String uri,String dbName){
        String endPoint = "/v1/documents";
        String queryString = "uri=" + uri + "&database=" + dbName;
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        req.setPayload("{\"test\":\"foo\",\"endpoint\":\"" + endPoint + "\"}");
        return req.put().responseCode;
    }

    public int deleteDocument(String uri,String dbName){
        String endPoint = "/v1/documents";
        String queryString = "uri=" + uri + "&database=" + dbName;
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        return req.delete().responseCode;
    }

    public String getDbCounts(String dbName){
        String endPoint = "/manage/v2/databases/" + dbName;
        String queryString = "view=counts&format=json";
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        return req.get().responseBody;
    }

    public String getDbStatus(String dbName){
        String endPoint = "/manage/v2/databases/" + dbName;
        String queryString = "view=status&format=json";
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        return req.get().responseBody;
    }

    public String getForestStatus(String forestName){
        String endPoint = "/manage/v2/forests/" + forestName;
        String queryString = "view=status&format=json";
        String url = constructUrl(true,serverUrl,
                serverPort,endPoint,queryString);
        req.setUrl(url);
        return req.get().responseBody;
    }


    private String constructUrl(Boolean isSSL,
                                String serverUrl,
                                String serverPort,
                                String endPoint,
                                String queryString
                                ){
        StringBuilder url = new StringBuilder();
        url.append((isSSL)?"https://":"http://");
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
