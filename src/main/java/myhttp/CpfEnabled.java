// CpfEnabled.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class CpfEnabled {
    private String units;
    private boolean value;

    @JsonProperty("units")
    public String getUnits() { return units; }
    @JsonProperty("units")
    public void setUnits(String value) { this.units = value; }

    @JsonProperty("value")
    public boolean getValue() { return value; }
    @JsonProperty("value")
    public void setValue(boolean value) { this.value = value; }
}