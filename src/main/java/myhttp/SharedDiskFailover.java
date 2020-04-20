// SharedDiskFailover.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class SharedDiskFailover {
    private CpfEnabled sharedDiskFailoverActive;

    @JsonProperty("shared-disk-failover-active")
    public CpfEnabled getSharedDiskFailoverActive() { return sharedDiskFailoverActive; }
    @JsonProperty("shared-disk-failover-active")
    public void setSharedDiskFailoverActive(CpfEnabled value) { this.sharedDiskFailoverActive = value; }
}