import myhttp.DatabaseTester;
import org.testng.annotations.*;

public class TestIngestion {
    protected TestConfig config = new TestConfig();
    protected DatabaseTester tester = new DatabaseTester(config.getTestdata());

    @Test(priority=1, dataProvider = "jsonDefaultDocProvider")
    public void ingestDefault(String uri){
        int insertDocResponseCode = tester.insertDocument(uri,config.databaseName);
        System.out.println("Inserted default document : " + uri + " | Response code : " + insertDocResponseCode);
    }

    @Test(priority=2, dataProvider = "jsonDocProvider")
    public void ingestJSON(String uri, String note){
        int insertDocResponseCode = tester.insertDocument(uri,config.databaseName,note);
        System.out.println("Inserted custom document : " + uri);
    }

    @DataProvider(name="jsonDocProvider")
    public Object[][] getJsonDocs(){
        Object[][] data = {
                {"/foo1.json","This is a test document"},
                {"/foo2.json","This is a funny document"},
                {"/foo3.json","This is a test document"},
                {"/foo4.json","This is a very funny document"},
                {"/foo5.json","document is a draft only"}
        };
        return data;
    }

    @DataProvider(name="jsonDefaultDocProvider")
    public Object[][] getDefaultJsonDocs(){
        Object[][] data = {
                {"/defaultFoo1.json"}, // default note : "This is a sample test document"
                {"/defaultFoo2.json"},
                {"/defaultFoo3.json"},
                {"/defaultFoo4.json"},
                {"/defaultFoo5.json"}
        };
        return data;
    }

}

