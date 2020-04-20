// DatabaseCounts.java

package myhttp;

import com.fasterxml.jackson.annotation.*;

public class DatabaseCounts {
    private String id;
    private String name;
    private Meta meta;
    private DatabaseCountProperties databaseCountProperties;
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

    @JsonProperty("count-properties")
    public DatabaseCountProperties getDatabaseCountProperties() { return databaseCountProperties; }
    @JsonProperty("count-properties")
    public void setDatabaseCountProperties(DatabaseCountProperties value) { this.databaseCountProperties = value; }

    @JsonProperty("related-views")
    public RelatedViews getRelatedViews() { return relatedViews; }
    @JsonProperty("related-views")
    public void setRelatedViews(RelatedViews value) { this.relatedViews = value; }
}