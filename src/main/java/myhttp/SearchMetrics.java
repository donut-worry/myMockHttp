// Metrics.java
package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SearchMetrics {
    private String queryResolutionTime;
    private String snippetResolutionTime;
    private String totalTime;

    @JsonProperty("query-resolution-time")
    public String getQueryResolutionTime() { return queryResolutionTime; }
    @JsonProperty("query-resolution-time")
    public void setQueryResolutionTime(String value) { this.queryResolutionTime = value; }

    @JsonProperty("snippet-resolution-time")
    public String getSnippetResolutionTime() { return snippetResolutionTime; }
    @JsonProperty("snippet-resolution-time")
    public void setSnippetResolutionTime(String value) { this.snippetResolutionTime = value; }

    @JsonProperty("total-time")
    public String getTotalTime() { return totalTime; }
    @JsonProperty("total-time")
    public void setTotalTime(String value) { this.totalTime = value; }
}