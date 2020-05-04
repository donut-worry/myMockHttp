// DBConfig.java
package myHttpTester;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DBConfig {
    private String databaseName;
    private String forestName;

    @JsonProperty("databaseName")
    public String getDatabaseName() { return databaseName; }
    @JsonProperty("databaseName")
    public void setDatabaseName(String value) { this.databaseName = value; }

    @JsonProperty("forestName")
    public String getForestName() { return forestName; }
    @JsonProperty("forestName")
    public void setForestName(String value) { this.forestName = value; }
}
