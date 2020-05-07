import myhttp.StressTestCounter;
import myhttp.*;
import org.testng.annotations.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestStress {
    protected TestConfig config = new TestConfig();
    public StressTestCounter counter = new StressTestCounter();
    private String[] queries = {"test","foo"};
    int noOfUpdates = 2;



    @Test(priority=1)
    public void stressTest(){
        DatabaseStressTester[] tests = {
                new DatabaseStressUpdateTester(config.getTestdata(), counter),
                new DatabaseStressQueryTester(config.getTestdata(), counter),
                new DatabaseStressDeleteTester(config.getTestdata(), counter),
                new DatabaseStressQueryTester(config.getTestdata(), counter),
                new DatabaseStressQueryTester(config.getTestdata(), counter)
        };
        ExecutorService executor = Executors.newFixedThreadPool(config.maxUsers);
        try{
            for(int i=0; i < config.maxTasks; i++){
                System.out.println("Spawning task # " + i+1);
                DatabaseStressTester tester = tests[i % tests.length];
                tester.setNumUpdates(noOfUpdates);
                tester.setQueries(queries);
                tester.setNumDeletes(noOfUpdates);
                executor.submit(tester);
            }
        } finally {
            executor.shutdown();
        }
        try {
            executor.awaitTermination(600, TimeUnit.SECONDS);
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


//    @DataProvider(name="stressObjProvider")
//    public Object[][] stressTestProvider(){
//        DatabaseStressTester[] data = {
//                new DatabaseStressUpdateTester(config.getTestdata()),
//                new DatabaseStressQueryTester(config.getTestdata()),
//                new DatabaseStressDeleteTester(config.getTestdata()),
//                new DatabaseStressQueryTester(config.getTestdata()),
//                new DatabaseStressQueryTester(config.getTestdata())
//        };
//    }

}
