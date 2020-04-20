// ResponseDatabaseStatus.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ResponseDatabaseStatus {
    private DatabaseStatus databaseStatus;

    @JsonProperty("database-status")
    public DatabaseStatus getDatabaseStatus() { return databaseStatus; }
    @JsonProperty("database-status")
    public void setDatabaseStatus(DatabaseStatus value) { this.databaseStatus = value; }
}