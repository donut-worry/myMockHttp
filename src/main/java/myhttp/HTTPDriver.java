package myhttp;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class HTTPDriver {
    public static void main(String[] args) {
        DatabaseTester tester = new DatabaseTester("macpro-6021.marklogic.com");
        String dbName = "Test-DB";
        String forestName = "Test-Forest";

        // Setup : Create DB and Forests
        int createDbResponseCode = tester.createDB(dbName);
        System.out.println("Create DB Response code :" + createDbResponseCode);

        int createForestResponseCode = tester.createForest(forestName,dbName);
        System.out.println("Create Forest Response code : " + createForestResponseCode);

        // Insert / delete documents
        int insertDoc1ResponseCode = tester.insertDocument("/foo1.json",dbName);
        System.out.println("Insert document 1 : " + insertDoc1ResponseCode);
        int insertDoc2ResponseCode = tester.insertDocument("/foo2.json",dbName);
        System.out.println("Insert document 2 : " + insertDoc2ResponseCode);
        int insertDoc3ResponseCode = tester.insertDocument("/foo3.json",dbName);
        System.out.println("Insert document 3 : " + insertDoc3ResponseCode);
        int insertDoc4ResponseCode = tester.insertDocument("/foo4.json",dbName);
        System.out.println("Insert document 4 : " + insertDoc4ResponseCode);
        int insertDoc5ResponseCode = tester.insertDocument("/foo5.json",dbName);
        System.out.println("Insert document 5 : " + insertDoc5ResponseCode);

        // Check db counts
        String dbCounts1Result = tester.getDbCounts(dbName);
        System.out.println("DB Counts 1 : ");
        System.out.println(dbCounts1Result);

        int deleteDoc2ResponseCode = tester.deleteDocument("/foo2.json",dbName);
        System.out.println("Delete document 2 : " + insertDoc2ResponseCode);
        int deleteDoc3ResponseCode = tester.deleteDocument("/foo3.json",dbName);
        System.out.println("Delete document 3 : " + insertDoc3ResponseCode);

        // check db counts
        String dbCounts2Result = tester.getDbCounts(dbName);
        System.out.println("DB Counts 2 : ");
        System.out.println(dbCounts2Result);

        // Check db and forest status
        String dbStatus1Response = tester.getDbStatus(dbName);
        System.out.println("Database Status : ");
        System.out.println(dbStatus1Response);
        String forestStatus1Response = tester.getForestStatus(forestName);
        System.out.println("Forest Status : ");
        System.out.println(forestStatus1Response);

        // Teardown : delete database and forest
        int deleteForestDbResponseCode = tester.deleteDbForest(dbName);
        System.out.println("Delete Forest and DB : " + deleteForestDbResponseCode);



//        String url = "https://jsonmock.hackerrank.com/api/article_users?page=1";
//        String url2 = "https://macpro-6021.marklogic.com:8002/manage/v2/databases/Documents?view=status&format=json";
//
//        String jsonResponse = MyHTTPJava11Request.myHttpRequest(url);
//        System.out.println("Response : ");
//        System.out.println(jsonResponse);
//
//        MyHTTPRequest req = new MyHTTPRequest();
//        req.setAuthenticationMethod("Basic");
//        req.setUserPass("admin:admin");
//        req.setMethod("GET");
//        req.setUrl(url2);
//
//        String jsonResponse2 = req.get();
//        System.out.println("Response 2 : ");
//        System.out.println(jsonResponse2);
//
//        String url3 = "https://macpro-6021.marklogic.com:8002/manage/v2/databases?format=json";
//        req.setMethod("POST");
//        req.setUrl(url3);
//        req.setPayload("{\"database-name\":\"A-DB\"}");
//        String jsonResponse3 = req.post();
//        System.out.println("Response 3 : ");
//        System.out.println(jsonResponse3);
//
//        String url4 = "https://macpro-6021.marklogic.com:8002/manage/v2/forests?format=json&wait-for-forest-to-mount=true";
//        req.setUrl(url4);
//        req.setPayload("{\"forest-name\":\"A-Forest\",\"database\":\"A-DB\"}");
//        String jsonResponse4 = req.post();
//        System.out.println("Response 4 : ");
//        System.out.println(jsonResponse4);
//
//        String url5 = "https://macpro-6021.marklogic.com:8002/v1/documents?uri=/foo1.json&database=A-DB";
//        req.setUrl(url5);
//        req.setPayload("{\"test\":\"foo\",\"url\":\"" + url + "A-DB\"}");
//        String jsonResponse5 = req.put();
//        System.out.println("Response 5 : ");
//        System.out.println(jsonResponse5);
//
//        String url6 = "https://macpro-6021.marklogic.com:8002/v1/documents?uri=/foo2.json&database=A-DB";
//        req.setUrl(url6);
//        req.setPayload("{\"test\":\"bar\",\"url\":\"" + url2 + "\"}");
//        String jsonResponse6 = req.put();
//        System.out.println("Response 6 : ");
//        System.out.println(jsonResponse6);
//
//        String url7 = "https://macpro-6021.marklogic.com:8002/v1/documents?uri=/foo1.json&database=A-DB";
//        req.setUrl(url7);
//        String jsonResponse7 = req.delete();
//        System.out.println("Response 7 : ");
//        System.out.println(jsonResponse7);

        // Create Jackson ObjectMapper Object
        //ObjectMapper mapper = new ObjectMapper();

        //JsonResponse obj = mapper.readValue(jsonResponse, JsonResponse.class);

        //System.out.println(obj);
    }
}
