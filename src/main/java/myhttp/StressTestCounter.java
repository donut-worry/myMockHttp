package myhttp;

public class StressTestCounter {
    private int queryTestCnt = 0;
    private int updateTestCnt = 0;
    private int deleteTestCnt = 0;
    private int totalTestCnt = 0;
    private long docCount = 0;


    public int getQueryTestCnt() {
        return queryTestCnt;
    }

    public synchronized void incrQueryTestCnt() {
        queryTestCnt++;
        incrTotalTestCnt();
    }

    public int getUpdateTestCnt() {
        return updateTestCnt;
    }

    public synchronized void incrUpdateTestCnt() {
        updateTestCnt++;
        incrTotalTestCnt();
    }

    public int getDeleteTestCnt() {
        return deleteTestCnt;
    }

    public synchronized void incrDeleteTestCnt() {
        deleteTestCnt++;
        incrTotalTestCnt();
    }

    public int getTotalTestCnt() {
        return totalTestCnt;
    }

    public synchronized void incrTotalTestCnt() {
        totalTestCnt++;
    }

    public long getDocCount() {
        return docCount;
    }

    public synchronized void incrDocCount() {
        docCount++;
    }
}
