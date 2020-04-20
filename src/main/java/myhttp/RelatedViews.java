// RelatedViews.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RelatedViews {
    private RelatedView[] relatedView;

    @JsonProperty("related-view")
    public RelatedView[] getRelatedView() { return relatedView; }
    @JsonProperty("related-view")
    public void setRelatedView(RelatedView[] value) { this.relatedView = value; }
}