// DatabaseStatus.java

package myhttp;

import com.fasterxml.jackson.annotation.*;

public class DatabaseStatus {
    private String id;
    private String name;
    private Meta meta;
    private Relations relations;
    private DatabaseStatusProperties statusProperties;
    private RelatedViews relatedViews;

    @JsonProperty("id")
    public String getID() { return id; }
    @JsonProperty("id")
    public void setID(String value) { this.id = value; }

    @JsonProperty("name")
    public String getName() { return name; }
    @JsonProperty("name")
    public void setName(String value) { this.name = value; }

    @JsonProperty("meta")
    public Meta getMeta() { return meta; }
    @JsonProperty("meta")
    public void setMeta(Meta value) { this.meta = value; }

    @JsonProperty("relations")
    public Relations getRelations() { return relations; }
    @JsonProperty("relations")
    public void setRelations(Relations value) { this.relations = value; }

    @JsonProperty("status-properties")
    public DatabaseStatusProperties getStatusProperties() { return statusProperties; }
    @JsonProperty("status-properties")
    public void setStatusProperties(DatabaseStatusProperties value) { this.statusProperties = value; }

    @JsonProperty("related-views")
    public RelatedViews getRelatedViews() { return relatedViews; }
    @JsonProperty("related-views")
    public void setRelatedViews(RelatedViews value) { this.relatedViews = value; }
}