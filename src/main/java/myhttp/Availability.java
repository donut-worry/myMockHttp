// Availability.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Availability {
    private Units units;
    private String value;

    @JsonProperty("units")
    public Units getUnits() { return units; }
    @JsonProperty("units")
    public void setUnits(Units value) { this.units = value; }

    @JsonProperty("value")
    public String getValue() { return value; }
    @JsonProperty("value")
    public void setValue(String value) { this.value = value; }
}