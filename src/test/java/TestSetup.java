import myhttp.DatabaseTester;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestSetup {
    protected TestConfig config = new TestConfig();
    protected DatabaseTester tester = new DatabaseTester(config.serverUrl, config.serverPort, config.isSsl,
            config.authenticationMethod, config.mlUser, config.mlPasswd);

    @BeforeTest
    public void printConfig(){
        config.printConfig();
    }

    @BeforeTest(dependsOnMethods = {"printConfig"})
    public void createDB(){
        System.out.println("This test creates database");
        int createDbResponseCode = tester.createDB(config.databaseName);
        //System.out.println("Create DB Response code :" + createDbResponseCode); // 201
        Assert.assertEquals(createDbResponseCode, 201);
    }

    @BeforeTest(dependsOnMethods = {"createDB"})
    public void createForests(){
        System.out.println("This test creates forests");
        int createForestResponseCode = tester.createForest(config.forestName, config.databaseName);
        //System.out.println("Create Forest Response code : " + createForestResponseCode); // 201
        Assert.assertEquals(createForestResponseCode, 201);
    }

//    @AfterTest
//    public void deleteDBForests() {
//        System.out.println("This test deletes forests");
//        int deleteDbResponseCode = tester.deleteDbForest(config.databaseName);
//        //System.out.println("Delete DB Forest Response code :" + deleteDbResponseCode); // 204
//        Assert.assertEquals(deleteDbResponseCode, 204);
//    }

}
