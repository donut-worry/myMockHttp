// RelationGroup.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RelationGroup {
    private String typeref;
    private Relation[] relation;

    @JsonProperty("typeref")
    public String getTyperef() { return typeref; }
    @JsonProperty("typeref")
    public void setTyperef(String value) { this.typeref = value; }

    @JsonProperty("relation")
    public Relation[] getRelation() { return relation; }
    @JsonProperty("relation")
    public void setRelation(Relation[] value) { this.relation = value; }
}