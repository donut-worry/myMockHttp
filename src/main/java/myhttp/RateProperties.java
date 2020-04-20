// RateProperties.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class RateProperties {
    private ElapsedTime totalRate;
    private Map<String, ElapsedTime> rateDetail;

    @JsonProperty("total-rate")
    public ElapsedTime getTotalRate() { return totalRate; }
    @JsonProperty("total-rate")
    public void setTotalRate(ElapsedTime value) { this.totalRate = value; }

    @JsonProperty("rate-detail")
    public Map<String, ElapsedTime> getRateDetail() { return rateDetail; }
    @JsonProperty("rate-detail")
    public void setRateDetail(Map<String, ElapsedTime> value) { this.rateDetail = value; }
}