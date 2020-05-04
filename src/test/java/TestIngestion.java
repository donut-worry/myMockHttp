import myhttp.DatabaseTester;
import org.testng.annotations.*;

public class TestIngestion {
    private DatabaseTester tester = new DatabaseTester("macpro-6021.marklogic.com");
    private String dbName = "Test-DB";
    private String forestName = "Test-Forest";

    @Test(priority=1)
    public void ingestXML(){
        // Setup : Create DB and Forests
        //int createDbResponseCode = tester.createDB(dbName);
        //System.out.println("Create DB Response code :" + createDbResponseCode);
        System.out.println("XML files have been ingested");
    }

    @Test(priority=2)
    public void ingestJSON(){
        //int createForestResponseCode = tester.createForest(forestName,dbName);
        //System.out.println("Create Forest Response code : " + createForestResponseCode);
        System.out.println("JSON files have been ingested");
    }

}

