// CountProperties.java

package myhttp;

import com.fasterxml.jackson.annotation.*;

public class DatabaseCountProperties {
    private DatabaseActiveFragments documents;
    private DatabaseActiveFragments directories;
    private DatabaseActiveFragments databaseActiveFragments;
    private DatabaseActiveFragments deletedFragments;
    private DatabaseActiveFragments nascentFragments;

    @JsonProperty("documents")
    public DatabaseActiveFragments getDocuments() { return documents; }
    @JsonProperty("documents")
    public void setDocuments(DatabaseActiveFragments value) { this.documents = value; }

    @JsonProperty("directories")
    public DatabaseActiveFragments getDirectories() { return directories; }
    @JsonProperty("directories")
    public void setDirectories(DatabaseActiveFragments value) { this.directories = value; }

    @JsonProperty("active-fragments")
    public DatabaseActiveFragments getDatabaseActiveFragments() { return databaseActiveFragments; }
    @JsonProperty("active-fragments")
    public void setDatabaseActiveFragments(DatabaseActiveFragments value) { this.databaseActiveFragments = value; }

    @JsonProperty("deleted-fragments")
    public DatabaseActiveFragments getDeletedFragments() { return deletedFragments; }
    @JsonProperty("deleted-fragments")
    public void setDeletedFragments(DatabaseActiveFragments value) { this.deletedFragments = value; }

    @JsonProperty("nascent-fragments")
    public DatabaseActiveFragments getNascentFragments() { return nascentFragments; }
    @JsonProperty("nascent-fragments")
    public void setNascentFragments(DatabaseActiveFragments value) { this.nascentFragments = value; }
}