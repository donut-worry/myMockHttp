import myhttp.DatabaseTester;
import org.testng.annotations.*;

public class TestQueries {
    private DatabaseTester tester = new DatabaseTester("macpro-6021.marklogic.com");
    private String dbName = "Test-DB";
    private String forestName = "Test-Forest";

    @Test(priority=1)
    public void queryTest001(){
        // Setup : Create DB and Forests
        //int createDbResponseCode = tester.createDB(dbName);
        //System.out.println("Create DB Response code :" + createDbResponseCode);
        System.out.println("Running queryTest001");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority=2)
    public void queryTest002(){
        //int createForestResponseCode = tester.createForest(forestName,dbName);
        //System.out.println("Create Forest Response code : " + createForestResponseCode);
        System.out.println("Running queryTest002");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Test(priority=3)
    public void queryTest003(){
        // Setup : Create DB and Forests
        //int createDbResponseCode = tester.createDB(dbName);
        //System.out.println("Create DB Response code :" + createDbResponseCode);
        System.out.println("Running queryTest003");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority=4)
    public void queryTest004(){
        //int createForestResponseCode = tester.createForest(forestName,dbName);
        //System.out.println("Create Forest Response code : " + createForestResponseCode);
        System.out.println("Running queryTest004");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
