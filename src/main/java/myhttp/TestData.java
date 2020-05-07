// TestData.java
package myhttp;

import com.fasterxml.jackson.annotation.*;

public class TestData {
    private ConnectionInfo connectionInfo;
    private Authentication authentication;
    private DBConfig dbConfig;
    private StressConfig stressConfig;

    @JsonProperty("connectionInfo")
    public ConnectionInfo getConnectionInfo() { return connectionInfo; }
    @JsonProperty("connectionInfo")
    public void setConnectionInfo(ConnectionInfo value) { this.connectionInfo = value; }

    @JsonProperty("authentication")
    public Authentication getAuthentication() { return authentication; }
    @JsonProperty("authentication")
    public void setAuthentication(Authentication value) { this.authentication = value; }

    @JsonProperty("dbConfig")
    public DBConfig getDBConfig() { return dbConfig; }
    @JsonProperty("dbConfig")
    public void setDBConfig(DBConfig value) { this.dbConfig = value; }

    @JsonProperty("stressConfig")
    public StressConfig getStressConfig() { return stressConfig; }
    @JsonProperty("stressConfig")
    public void setStressConfig(StressConfig value) { this.stressConfig = value; }
}
