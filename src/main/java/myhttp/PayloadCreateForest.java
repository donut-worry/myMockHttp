// PayloadCreateForest.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class PayloadCreateForest {
    private String forestName;
    private String database;

    @JsonProperty("forest-name")
    public String getForestName() { return forestName; }
    @JsonProperty("forest-name")
    public void setForestName(String value) { this.forestName = value; }

    @JsonProperty("database")
    public String getDatabase() { return database; }
    @JsonProperty("database")
    public void setDatabase(String value) { this.database = value; }
}
