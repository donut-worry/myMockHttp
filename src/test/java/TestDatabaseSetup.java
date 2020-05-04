import myhttp.DatabaseTester;
import org.testng.annotations.*;

public class TestDatabaseSetup {
    private DatabaseTester tester = new DatabaseTester("macpro-6021.marklogic.com");
    private String dbName = "Test-DB";
    private String forestName = "Test-Forest";

    @BeforeTest
    public void createDB(){
        // Setup : Create DB and Forests
        //int createDbResponseCode = tester.createDB(dbName);
        //System.out.println("Create DB Response code :" + createDbResponseCode);
        System.out.println("This test creates database");
        TestConfig config = new TestConfig();
        config.printConfig();
        //System.out.println(TestConfig.getConfigFilePath());
    }

    @BeforeTest(dependsOnMethods = {"createDB"})
    public void createForests(){
        //int createForestResponseCode = tester.createForest(forestName,dbName);
        //System.out.println("Create Forest Response code : " + createForestResponseCode);
        System.out.println("This test creates forests");
    }

}
