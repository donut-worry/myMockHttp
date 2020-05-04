import myhttp.DatabaseTester;
import org.testng.annotations.*;

public class TestDatabaseCleanup {
    private DatabaseTester tester = new DatabaseTester("macpro-6021.marklogic.com");
    private String dbName = "Test-DB";
    private String forestName = "Test-Forest";

    @AfterTest
    public void deleteForests(){
        // Setup : Create DB and Forests
        //int createDbResponseCode = tester.createDB(dbName);
        //System.out.println("Create DB Response code :" + createDbResponseCode);
        System.out.println("This test deletes forests");
    }

    @AfterTest(dependsOnMethods = {"deleteForests"})
    public void deleteDB(){
        //int createForestResponseCode = tester.createForest(forestName,dbName);
        //System.out.println("Create Forest Response code : " + createForestResponseCode);
        System.out.println("This test deletes database");
    }

}
