// Units.java

package myhttp;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Units {
    DATETIME, ENUM, QUANTITY, SECONDS, TIME, PERCENT, HITS_SEC, MB, MB_SEC,
    MISSES_SEC, SEC, SEC_SEC, BYTES, EMPTY, FRACTION, LOCKS, LOCKS_SEC, SECS_SEC;



    @JsonValue
    public String toValue() {
        switch (this) {
            case DATETIME: return "datetime";
            case ENUM: return "enum";
            case QUANTITY: return "quantity";
            case SECONDS: return "seconds";
            case TIME: return "time";
            case PERCENT: return "%";
            case HITS_SEC: return "hits/sec";
            case MB: return "MB";
            case MB_SEC: return "MB/sec";
            case MISSES_SEC: return "misses/sec";
            case SEC: return "sec";
            case SEC_SEC: return "sec/sec";
            case BYTES: return "bytes";
            case EMPTY: return "";
            case FRACTION: return "fraction";
            case LOCKS: return "locks";
            case LOCKS_SEC: return "locks/sec";
            case SECS_SEC: return "secs/sec";
        }
        return null;
    }

    @JsonCreator
    public static Units forValue(String value) throws IOException {
        if (value.equals("datetime")) return DATETIME;
        if (value.equals("enum")) return ENUM;
        if (value.equals("quantity")) return QUANTITY;
        if (value.equals("seconds")) return SECONDS;
        if (value.equals("time")) return TIME;
        if (value.equals("%")) return PERCENT;
        if (value.equals("hits/sec")) return HITS_SEC;
        if (value.equals("MB")) return MB;
        if (value.equals("MB/sec")) return MB_SEC;
        if (value.equals("misses/sec")) return MISSES_SEC;
        if (value.equals("sec")) return SEC;
        if (value.equals("sec/sec")) return SEC_SEC;
        if (value.equals("bytes")) return BYTES;
        if (value.equals("")) return EMPTY;
        if (value.equals("fraction")) return FRACTION;
        if (value.equals("locks")) return LOCKS;
        if (value.equals("locks/sec")) return LOCKS_SEC;
        if (value.equals("secs/sec")) return SECS_SEC;
        throw new IOException("Cannot deserialize Units");
    }
}
