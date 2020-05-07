package myhttp;

public class DatabaseStressQueryTester extends DatabaseStressTester {
    private String[] queries = {"test","very funny","foo","document"};
    private StressTestCounter counter;
    public DatabaseStressQueryTester(TestData testData, StressTestCounter counter) {
        super(testData);
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Running queries from thread : " + Thread.currentThread().getName());
        for(String searchString : queries){
            super.runSearchQuery(searchString, dbName);
        }
        counter.incrQueryTestCnt();
    }

    @Override
    public void setQueries(String[] queries){
        this.queries = queries;
    }

    @Override
    public String[] getQueries(){
        return queries;
    }
}
