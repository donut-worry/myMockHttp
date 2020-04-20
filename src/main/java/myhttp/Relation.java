// Relation.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Relation {
    private String uriref;
    private String idref;
    private String nameref;

    @JsonProperty("uriref")
    public String getUriref() { return uriref; }
    @JsonProperty("uriref")
    public void setUriref(String value) { this.uriref = value; }

    @JsonProperty("idref")
    public String getIdref() { return idref; }
    @JsonProperty("idref")
    public void setIdref(String value) { this.idref = value; }

    @JsonProperty("nameref")
    public String getNameref() { return nameref; }
    @JsonProperty("nameref")
    public void setNameref(String value) { this.nameref = value; }
}