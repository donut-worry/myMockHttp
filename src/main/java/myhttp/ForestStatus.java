// ForestStatus.java

package myhttp;

import com.fasterxml.jackson.annotation.*;

public class ForestStatus {
    private String id;
    private String name;
    private Meta meta;
    private Relations relations;
    private ForestStatusProperties forestStatusProperties;
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
    public ForestStatusProperties getForestStatusProperties() { return forestStatusProperties; }
    @JsonProperty("status-properties")
    public void setForestStatusProperties(ForestStatusProperties value) { this.forestStatusProperties = value; }

    @JsonProperty("related-views")
    public RelatedViews getRelatedViews() { return relatedViews; }
    @JsonProperty("related-views")
    public void setRelatedViews(RelatedViews value) { this.relatedViews = value; }
}
