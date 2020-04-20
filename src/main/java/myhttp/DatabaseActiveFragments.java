// ActiveFragments.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DatabaseActiveFragments {
    private String units;
    private double value;

    @JsonProperty("units")
    public String getUnits() { return units; }
    @JsonProperty("units")
    public void setUnits(String value) { this.units = value; }

    @JsonProperty("value")
    public double getValue() { return value; }
    @JsonProperty("value")
    public void setValue(double value) { this.value = value; }
}