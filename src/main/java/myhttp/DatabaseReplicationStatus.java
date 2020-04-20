// DatabaseReplicationStatus.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DatabaseReplicationStatus {
    private CpfEnabled databaseReplicationConfigured;

    @JsonProperty("database-replication-configured")
    public CpfEnabled getDatabaseReplicationConfigured() { return databaseReplicationConfigured; }
    @JsonProperty("database-replication-configured")
    public void setDatabaseReplicationConfigured(CpfEnabled value) { this.databaseReplicationConfigured = value; }
}