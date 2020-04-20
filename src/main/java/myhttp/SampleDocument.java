// SampleDocument.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SampleDocument {
    private String docName;
    private String count;

    @JsonProperty("docName")
    public String getDocName() { return docName; }
    @JsonProperty("docName")
    public void setDocName(String value) { this.docName = value; }

    @JsonProperty("count")
    public String getCount() { return count; }
    @JsonProperty("count")
    public void setCount(String value) { this.count = value; }
}
