// StressConfig.java
package myhttp;

import com.fasterxml.jackson.annotation.*;

public class StressConfig {
    private String maxUsers;
    private String maxTasks;

    @JsonProperty("maxUsers")
    public String getMaxUsers() { return maxUsers; }
    @JsonProperty("maxUsers")
    public void setMaxUsers(String value) { this.maxUsers = value; }

    @JsonProperty("maxTasks")
    public String getMaxTasks() { return maxTasks; }
    @JsonProperty("maxTasks")
    public void setMaxTasks(String value) { this.maxTasks = value; }
}