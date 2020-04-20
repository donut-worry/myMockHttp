// ResponseDatabaseCounts.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ResponseDatabaseCounts {
    private DatabaseCounts databaseCounts;

    @JsonProperty("database-counts")
    public DatabaseCounts getDatabaseCounts() { return databaseCounts; }
    @JsonProperty("database-counts")
    public void setDatabaseCounts(DatabaseCounts value) { this.databaseCounts = value; }
}