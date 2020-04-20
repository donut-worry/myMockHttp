// RelatedView.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RelatedView {
    private String viewType;
    private String viewName;
    private String viewURI;

    @JsonProperty("view-type")
    public String getViewType() { return viewType; }
    @JsonProperty("view-type")
    public void setViewType(String value) { this.viewType = value; }

    @JsonProperty("view-name")
    public String getViewName() { return viewName; }
    @JsonProperty("view-name")
    public void setViewName(String value) { this.viewName = value; }

    @JsonProperty("view-uri")
    public String getViewURI() { return viewURI; }
    @JsonProperty("view-uri")
    public void setViewURI(String value) { this.viewURI = value; }
}