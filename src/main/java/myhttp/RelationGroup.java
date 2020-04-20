// RelationGroup.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RelationGroup {
    private String typeref;
    private ElapsedTime relationCount;
    private Relation[] relation;

    @JsonProperty("typeref")
    public String getTyperef() { return typeref; }
    @JsonProperty("typeref")
    public void setTyperef(String value) { this.typeref = value; }

    @JsonProperty("relation-count")
    public ElapsedTime getRelationCount() { return relationCount; }
    @JsonProperty("relation-count")
    public void setRelationCount(ElapsedTime value) { this.relationCount = value; }

    @JsonProperty("relation")
    public Relation[] getRelation() { return relation; }
    @JsonProperty("relation")
    public void setRelation(Relation[] value) { this.relation = value; }
}