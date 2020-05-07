package myhttp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampGenerator {
    public synchronized static String getCurrentTimestamp(){
        String pattern = "yyyyMMdd-HHmmss-SSS";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return date;
    }

}
