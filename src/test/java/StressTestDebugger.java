import myhttp.*;
import org.testng.annotations.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StressTestDebugger {
    protected TestConfig config = new TestConfig();
    public StressTestCounter counter = new StressTestCounter();

    @Test(priority=1)
    public void stressTest(){
        ExecutorService executor = Executors.newFixedThreadPool(config.maxUsers);
        DatabaseStressTester tester = new DatabaseStressUpdateTester(config.getTestdata(), counter);
        DatabaseStressTester tester2 = new DatabaseStressQueryTester(config.getTestdata(), counter);
//        tester.start();
//        try {
//            tester.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        try{
            tester.setNumUpdates(200);
            //tester.start();
            executor.execute(tester);
            String[] queries = {"test","foo"};
            tester2.setQueries(queries);
            //tester2.start();
            executor.execute(tester2);

//            tester.join();
//            tester2.join();



        } finally {
            executor.shutdown();
        }
        try {
            executor.awaitTermination(300, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            System.out.println("Exception found while waiting for all threads to complete");
            e.printStackTrace();
        }
        System.out.println("Stress Test counts : ");
        System.out.println("Update Tests : " + counter.getUpdateTestCnt());
        System.out.println("Delete Tests : " + counter.getDeleteTestCnt());
        System.out.println("Query Tests : " + counter.getQueryTestCnt());
        System.out.println("Documents Inserted : " + counter.getDocCount());
        System.out.println("Total Tests : " + counter.getTotalTestCnt());
    }


}
