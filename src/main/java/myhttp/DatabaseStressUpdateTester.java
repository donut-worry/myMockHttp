package myhttp;

public class DatabaseStressUpdateTester extends DatabaseStressTester {
    private int numUpdates;
    private StressTestCounter counter;

    public DatabaseStressUpdateTester(TestData testData, StressTestCounter counter) {
        super(testData);
        this.numUpdates = 100;
        this.counter = counter;
    }

    @Override
    public void run() {
        System.out.println("Running " + numUpdates + " updates from thread : " + Thread.currentThread().getName());
        for(int i=0; i < numUpdates; i++){
            //System.out.println("i = " + i + "  | numUpdates = " + numUpdates);
           String uri = "/" + TimestampGenerator.getCurrentTimestamp() + "/" + i + ".json";
           String note = "Inserting document with uri " + uri + " into database " + dbName;
           //System.out.println(note);
           int responseCode = insertDocument(uri,dbName,note);
           counter.incrDocCount();
            //System.out.println("Response code for document insert : " + responseCode);
       }
        counter.incrUpdateTestCnt();
    }

    @Override
    public void setNumUpdates(int numUpdates){
        this.numUpdates = numUpdates;
    }
    @Override
    public int getNumUpdates(){
        return numUpdates;
    }
}
