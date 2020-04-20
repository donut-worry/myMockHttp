// Meta.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Meta {
    private String uri;
    private String currentTime;
    private ElapsedTime elapsedTime;

    @JsonProperty("uri")
    public String getURI() { return uri; }
    @JsonProperty("uri")
    public void setURI(String value) { this.uri = value; }

    @JsonProperty("current-time")
    public String getCurrentTime() { return currentTime; }
    @JsonProperty("current-time")
    public void setCurrentTime(String value) { this.currentTime = value; }

    @JsonProperty("elapsed-time")
    public ElapsedTime getElapsedTime() { return elapsedTime; }
    @JsonProperty("elapsed-time")
    public void setElapsedTime(ElapsedTime value) { this.elapsedTime = value; }
}
