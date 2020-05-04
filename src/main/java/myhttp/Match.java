// Match.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Match {
    private String path;
    private Object[] matchText;

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("match-text")
    public Object[] getMatchText() { return matchText; }
    @JsonProperty("match-text")
    public void setMatchText(Object[] value) { this.matchText = value; }
}