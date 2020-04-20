// LocalDiskFailover.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class LocalDiskFailover {
    private CpfEnabled localDiskFailoverActive;

    @JsonProperty("local-disk-failover-active")
    public CpfEnabled getLocalDiskFailoverActive() { return localDiskFailoverActive; }
    @JsonProperty("local-disk-failover-active")
    public void setLocalDiskFailoverActive(CpfEnabled value) { this.localDiskFailoverActive = value; }
}