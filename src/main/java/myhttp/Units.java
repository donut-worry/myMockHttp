// Units.java

package myhttp;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Units {
    DATETIME, ENUM, QUANTITY, SECONDS, TIME;

    @JsonValue
    public String toValue() {
        switch (this) {
            case DATETIME: return "datetime";
            case ENUM: return "enum";
            case QUANTITY: return "quantity";
            case SECONDS: return "seconds";
            case TIME: return "time";
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
        throw new IOException("Cannot deserialize Units");
    }
}
