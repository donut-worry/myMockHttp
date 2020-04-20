// Welcome.java
package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Welcome {
    private ForestStatus forestStatus;

    @JsonProperty("forest-status")
    public ForestStatus getForestStatus() { return forestStatus; }
    @JsonProperty("forest-status")
    public void setForestStatus(ForestStatus value) { this.forestStatus = value; }
}