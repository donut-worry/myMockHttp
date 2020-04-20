// LoadProperties.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LoadProperties {
    private ElapsedTime totalLoad;
    private Map<String, ElapsedTime> loadDetail;

    @JsonProperty("total-load")
    public ElapsedTime getTotalLoad() { return totalLoad; }
    @JsonProperty("total-load")
    public void setTotalLoad(ElapsedTime value) { this.totalLoad = value; }

    @JsonProperty("load-detail")
    public Map<String, ElapsedTime> getLoadDetail() { return loadDetail; }
    @JsonProperty("load-detail")
    public void setLoadDetail(Map<String, ElapsedTime> value) { this.loadDetail = value; }
}