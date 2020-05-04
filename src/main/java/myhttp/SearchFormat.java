// Format.java

package myhttp;

import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum SearchFormat {
    JSON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case JSON: return "json";
        }
        return null;
    }

    @JsonCreator
    public static SearchFormat forValue(String value) throws IOException {
        if (value.equals("json")) return JSON;
        throw new IOException("Cannot deserialize Format");
    }
}