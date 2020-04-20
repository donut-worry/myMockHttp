// PayloadCreateDB.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class PayloadCreateDB {
    private String databaseName;

    @JsonProperty("database-name")
    public String getDatabaseName() { return databaseName; }
    @JsonProperty("database-name")
    public void setDatabaseName(String value) { this.databaseName = value; }
}
