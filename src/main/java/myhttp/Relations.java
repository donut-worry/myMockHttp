// Relations.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Relations {
    private RelationGroup[] relationGroup;

    @JsonProperty("relation-group")
    public RelationGroup[] getRelationGroup() { return relationGroup; }
    @JsonProperty("relation-group")
    public void setRelationGroup(RelationGroup[] value) { this.relationGroup = value; }
}