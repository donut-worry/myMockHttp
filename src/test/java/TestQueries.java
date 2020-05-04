import myhttp.DatabaseTester;
import myhttp.ResponseSearch;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestQueries {
    protected TestConfig config = new TestConfig();
    protected DatabaseTester tester = new DatabaseTester(config.serverUrl, config.serverPort, config.isSsl,
            config.authenticationMethod, config.mlUser, config.mlPasswd);


    @Test(dataProvider = "searchStrings")
    public void queryTest(String searchString, int expectedCnt){
        System.out.println("Running queryTest with searchString : " + searchString + "  expectedCnt : " + expectedCnt);
        ResponseSearch searchResponse = tester.runSearchQuery(searchString,config.databaseName);
        int matchCnt = searchResponse.getResults().length;
        Assert.assertEquals(matchCnt, expectedCnt);
//        System.out.println("Search results for search string " +
//                searchString + "  : " + searchResponse.getResults().length +
//                "  expected : " + expectedCnt);
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    @DataProvider(name="searchStrings")
    public Object[][] getSearchStrings(){
        Object[][] data = {
            {"test",7},
            {"this",9},
            {"sample",5},
            {"funny",2},
            {"very funny",1},
            {"draft",1}
        };
        return data;
    }

}
