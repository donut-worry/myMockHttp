package myhttp;

import com.fasterxml.jackson.annotation.*;

import java.util.Map;

public class DatabaseStatusProperties {
    private CpfEnabled enabled;
    private DeviceSpace state;
    private DeviceSpace indexingState;
    private DeviceSpace rebalancingState;
    private ElapsedTime forestsCount;
    private DeviceSpace deviceSpace;
    private ElapsedTime dataSize;
    private ElapsedTime largeDataSize;
    private ElapsedTime fastDataSize;
    private ElapsedTime inMemorySize;
    private ElapsedTime averageForestSize;
    private ElapsedTime largestForestSize;
    private ElapsedTime leastRemainingSpaceForest;
    private ElapsedTime mergeCount;
    private ElapsedTime totalMergeSize;
    private ElapsedTime reindexCount;
    private ElapsedTime backupCount;
    private ElapsedTime restoreCount;
    private ElapsedTime minCapacity;
    private LoadProperties loadProperties;
    private RateProperties rateProperties;
    private Map<String, ElapsedTime> cacheProperties;
    private LocalDiskFailover localDiskFailover;
    private DatabaseReplicationStatus databaseReplicationStatus;
    private SharedDiskFailover sharedDiskFailover;
    private CpfEnabled flexibleReplicationEnabled;
    private CpfEnabled cpfEnabled;

    @JsonProperty("enabled")
    public CpfEnabled getEnabled() { return enabled; }
    @JsonProperty("enabled")
    public void setEnabled(CpfEnabled value) { this.enabled = value; }

    @JsonProperty("state")
    public DeviceSpace getState() { return state; }
    @JsonProperty("state")
    public void setState(DeviceSpace value) { this.state = value; }

    @JsonProperty("indexing-state")
    public DeviceSpace getIndexingState() { return indexingState; }
    @JsonProperty("indexing-state")
    public void setIndexingState(DeviceSpace value) { this.indexingState = value; }

    @JsonProperty("rebalancing-state")
    public DeviceSpace getRebalancingState() { return rebalancingState; }
    @JsonProperty("rebalancing-state")
    public void setRebalancingState(DeviceSpace value) { this.rebalancingState = value; }

    @JsonProperty("forests-count")
    public ElapsedTime getForestsCount() { return forestsCount; }
    @JsonProperty("forests-count")
    public void setForestsCount(ElapsedTime value) { this.forestsCount = value; }

    @JsonProperty("device-space")
    public DeviceSpace getDeviceSpace() { return deviceSpace; }
    @JsonProperty("device-space")
    public void setDeviceSpace(DeviceSpace value) { this.deviceSpace = value; }

    @JsonProperty("data-size")
    public ElapsedTime getDataSize() { return dataSize; }
    @JsonProperty("data-size")
    public void setDataSize(ElapsedTime value) { this.dataSize = value; }

    @JsonProperty("large-data-size")
    public ElapsedTime getLargeDataSize() { return largeDataSize; }
    @JsonProperty("large-data-size")
    public void setLargeDataSize(ElapsedTime value) { this.largeDataSize = value; }

    @JsonProperty("fast-data-size")
    public ElapsedTime getFastDataSize() { return fastDataSize; }
    @JsonProperty("fast-data-size")
    public void setFastDataSize(ElapsedTime value) { this.fastDataSize = value; }

    @JsonProperty("in-memory-size")
    public ElapsedTime getInMemorySize() { return inMemorySize; }
    @JsonProperty("in-memory-size")
    public void setInMemorySize(ElapsedTime value) { this.inMemorySize = value; }

    @JsonProperty("average-forest-size")
    public ElapsedTime getAverageForestSize() { return averageForestSize; }
    @JsonProperty("average-forest-size")
    public void setAverageForestSize(ElapsedTime value) { this.averageForestSize = value; }

    @JsonProperty("largest-forest-size")
    public ElapsedTime getLargestForestSize() { return largestForestSize; }
    @JsonProperty("largest-forest-size")
    public void setLargestForestSize(ElapsedTime value) { this.largestForestSize = value; }

    @JsonProperty("least-remaining-space-forest")
    public ElapsedTime getLeastRemainingSpaceForest() { return leastRemainingSpaceForest; }
    @JsonProperty("least-remaining-space-forest")
    public void setLeastRemainingSpaceForest(ElapsedTime value) { this.leastRemainingSpaceForest = value; }

    @JsonProperty("merge-count")
    public ElapsedTime getMergeCount() { return mergeCount; }
    @JsonProperty("merge-count")
    public void setMergeCount(ElapsedTime value) { this.mergeCount = value; }

    @JsonProperty("total-merge-size")
    public ElapsedTime getTotalMergeSize() { return totalMergeSize; }
    @JsonProperty("total-merge-size")
    public void setTotalMergeSize(ElapsedTime value) { this.totalMergeSize = value; }

    @JsonProperty("reindex-count")
    public ElapsedTime getReindexCount() { return reindexCount; }
    @JsonProperty("reindex-count")
    public void setReindexCount(ElapsedTime value) { this.reindexCount = value; }

    @JsonProperty("backup-count")
    public ElapsedTime getBackupCount() { return backupCount; }
    @JsonProperty("backup-count")
    public void setBackupCount(ElapsedTime value) { this.backupCount = value; }

    @JsonProperty("restore-count")
    public ElapsedTime getRestoreCount() { return restoreCount; }
    @JsonProperty("restore-count")
    public void setRestoreCount(ElapsedTime value) { this.restoreCount = value; }

    @JsonProperty("min-capacity")
    public ElapsedTime getMinCapacity() { return minCapacity; }
    @JsonProperty("min-capacity")
    public void setMinCapacity(ElapsedTime value) { this.minCapacity = value; }

    @JsonProperty("load-properties")
    public LoadProperties getLoadProperties() { return loadProperties; }
    @JsonProperty("load-properties")
    public void setLoadProperties(LoadProperties value) { this.loadProperties = value; }

    @JsonProperty("rate-properties")
    public RateProperties getRateProperties() { return rateProperties; }
    @JsonProperty("rate-properties")
    public void setRateProperties(RateProperties value) { this.rateProperties = value; }

    @JsonProperty("cache-properties")
    public Map<String, ElapsedTime> getCacheProperties() { return cacheProperties; }
    @JsonProperty("cache-properties")
    public void setCacheProperties(Map<String, ElapsedTime> value) { this.cacheProperties = value; }

    @JsonProperty("local-disk-failover")
    public LocalDiskFailover getLocalDiskFailover() { return localDiskFailover; }
    @JsonProperty("local-disk-failover")
    public void setLocalDiskFailover(LocalDiskFailover value) { this.localDiskFailover = value; }

    @JsonProperty("database-replication-status")
    public DatabaseReplicationStatus getDatabaseReplicationStatus() { return databaseReplicationStatus; }
    @JsonProperty("database-replication-status")
    public void setDatabaseReplicationStatus(DatabaseReplicationStatus value) { this.databaseReplicationStatus = value; }

    @JsonProperty("shared-disk-failover")
    public SharedDiskFailover getSharedDiskFailover() { return sharedDiskFailover; }
    @JsonProperty("shared-disk-failover")
    public void setSharedDiskFailover(SharedDiskFailover value) { this.sharedDiskFailover = value; }

    @JsonProperty("flexible-replication-enabled")
    public CpfEnabled getFlexibleReplicationEnabled() { return flexibleReplicationEnabled; }
    @JsonProperty("flexible-replication-enabled")
    public void setFlexibleReplicationEnabled(CpfEnabled value) { this.flexibleReplicationEnabled = value; }

    @JsonProperty("cpf-enabled")
    public CpfEnabled getCpfEnabled() { return cpfEnabled; }
    @JsonProperty("cpf-enabled")
    public void setCpfEnabled(CpfEnabled value) { this.cpfEnabled = value; }
}
