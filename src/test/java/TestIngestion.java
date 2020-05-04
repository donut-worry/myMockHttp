import myhttp.DatabaseTester;
import org.testng.annotations.*;

public class TestIngestion {
    protected TestConfig config = new TestConfig();
    protected DatabaseTester tester = new DatabaseTester(config.serverUrl, config.serverPort, config.isSsl,
            config.authenticationMethod, config.mlUser, config.mlPasswd);

    @Test(priority=1)
    public void ingestXML(){
        int insertDocResponseCode = tester.insertDocument("/fooxml1.json",config.databaseName);
        System.out.println("Inserted XML document :" + insertDocResponseCode);
        insertDocResponseCode = tester.insertDocument("/fooxml2.json",config.databaseName);
        System.out.println("Inserted XML document :" + insertDocResponseCode);
        insertDocResponseCode = tester.insertDocument("/fooxml3.json",config.databaseName);
        System.out.println("Inserted XML document :" + insertDocResponseCode);
        System.out.println("XML files have been ingested");
    }

    @Test(priority=2)
    public void ingestJSON(){
        int insertDocResponseCode = tester.insertDocument("/foo1.json",config.databaseName);
        System.out.println("Inserted JSON document :" + insertDocResponseCode);
        insertDocResponseCode = tester.insertDocument("/foo2.json",config.databaseName);
        System.out.println("Inserted JSON document :" + insertDocResponseCode);
        System.out.println("JSON files have been ingested");
    }

}

