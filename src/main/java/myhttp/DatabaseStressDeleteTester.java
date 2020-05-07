package myhttp;

public class DatabaseStressDeleteTester extends DatabaseStressTester {
    private int numDeletes;
    private StressTestCounter counter;

    public DatabaseStressDeleteTester(TestData testData, StressTestCounter counter) {
        super(testData);
        this.numDeletes = 100;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Running deletes from thread : " + Thread.currentThread().getName());
        counter.incrDeleteTestCnt();
        // No op for now for delete tester
    }

    @Override
    public void setNumDeletes(int numDeletes){
        this.numDeletes = numDeletes;
    }

    @Override
    public int getNumDeletes(){
        return numDeletes;
    }
}
