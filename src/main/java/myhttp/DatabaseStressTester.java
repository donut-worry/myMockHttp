package myhttp;

public class DatabaseStressTester extends DatabaseTester {
    protected int maxUsers;
    protected int maxTasks;
    protected String dbName;
    private String[] queries;
    private int numUpdates;
    private int numDeletes;


    public DatabaseStressTester(String serverUrl, int serverPort, boolean isSsl, String authMethod,
                                String user, String passwd, int maxUsers, int maxTasks, String dbName) {
        super(serverUrl, serverPort, isSsl, authMethod, user, passwd);
        this.maxUsers = maxUsers;
        this.maxTasks = maxTasks;
        this.dbName = dbName;
    }

    public DatabaseStressTester(TestData testData) {
        super(testData);
        DBConfig dbConfig = testData.getDBConfig();
        StressConfig stressConfig = testData.getStressConfig();
        this.maxUsers = Integer.parseInt(stressConfig.getMaxUsers());
        this.maxTasks = Integer.parseInt(stressConfig.getMaxTasks());
        this.dbName = dbConfig.getDatabaseName();
    }

    public void setNumUpdates(int numUpdates){ this.numUpdates = numUpdates; }
    public int getNumUpdates(){ return numUpdates; }
    public void setQueries(String[] queries){
        this.queries = queries;
    }
    public String[] getQueries(){
        return queries;
    }
    public void setNumDeletes(int numDeletes){
        this.numDeletes = numDeletes;
    }
    public int getNumDeletes(){
        return numDeletes;
    }


//    public void runUpdateTest(int numUpdates){
//        for(int i=0; i < numUpdates; i++){
//            String uri = "/" + TimestampGenerator.getCurrentTimestamp() + ".json";
//            String note = "Inserting document with uri " + uri + " into database " + dbName;
//            super.insertDocument(uri,dbName,note);
//        }
//
//    }
//
//    public void runDeleteTest(int numDeletes){
//        for(int i=0; i < numDeletes; i++){
//          // do nothing for now
//        }
//
//    }
//
//    public void runQueryTest(String[] searchStrings){
//        for(String searchString : searchStrings){
//            super.runSearchQuery(searchString, dbName);
//        }
//
//    }


}
