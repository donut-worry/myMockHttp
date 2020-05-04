// Mimetype.java
package myhttp;

import java.util.*;
import java.io.IOException;
import com.fasterxml.jackson.annotation.*;

public enum Mimetype {
    APPLICATION_JSON;

    @JsonValue
    public String toValue() {
        switch (this) {
            case APPLICATION_JSON: return "application/json";
        }
        return null;
    }

    @JsonCreator
    public static Mimetype forValue(String value) throws IOException {
        if (value.equals("application/json")) return APPLICATION_JSON;
        throw new IOException("Cannot deserialize Mimetype");
    }
}
