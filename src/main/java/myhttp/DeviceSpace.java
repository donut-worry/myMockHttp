// DeviceSpace.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DeviceSpace {
    private String units;
    private String value;

    @JsonProperty("units")
    public String getUnits() { return units; }
    @JsonProperty("units")
    public void setUnits(String value) { this.units = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}