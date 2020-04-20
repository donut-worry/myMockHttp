// StatusProperties.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class ForestStatusProperties {
    private Availability state;
    private Enabled enabled;
    private Availability availability;
    private Enabled encryption;
    private Availability updatesAllowed;
    private Enabled rebalancerEnable;
    private String masterForest;
    private String currentMasterForest;
    private Availability currentMasterPreciseTime;
    private ElapsedTime currentMasterFsn;
    private Availability currentForeignMasterCluster;
    private String currentForeignMasterDatabase;
    private String currentForeignMasterForest;
    private Availability currentForeignMasterPreciseTime;
    private ElapsedTime currentForeignMasterFsn;
    private Availability lastStateChange;
    private Availability nonblockingTimestamp;
    private Availability maxQueryTimestamp;
    private String dataDir;
    private ElapsedTime journalsSize;
    private ElapsedTime largeDataSize;
    private ElapsedTime orphanedBinaries;
    private Stand[] stand;
    private ElapsedTime forestReserve;
    private Enabled rebalancing;
    private Enabled reindexing;
    private ElapsedTime deviceSpace;
    private ElapsedTime transactionJournalSize;
    private ElapsedTime transactionJournalLimit;
    private ElapsedTime queryReadBytes;
    private Availability queryReadTime;
    private ElapsedTime queryReadRate;
    private ElapsedTime queryReadLoad;
    private ElapsedTime journalWriteBytes;
    private Availability journalWriteTime;
    private ElapsedTime journalWriteRate;
    private ElapsedTime journalWriteLoad;
    private ElapsedTime saveWriteBytes;
    private Availability saveWriteTime;
    private ElapsedTime saveWriteRate;
    private ElapsedTime saveWriteLoad;
    private ElapsedTime mergeReadBytes;
    private Availability mergeReadTime;
    private ElapsedTime mergeReadRate;
    private ElapsedTime mergeReadLoad;
    private ElapsedTime mergeWriteBytes;
    private Availability mergeWriteTime;
    private ElapsedTime mergeWriteRate;
    private ElapsedTime mergeWriteLoad;
    private ElapsedTime backupReadBytes;
    private Availability backupReadTime;
    private ElapsedTime backupReadRate;
    private ElapsedTime backupReadLoad;
    private ElapsedTime backupWriteBytes;
    private Availability backupWriteTime;
    private ElapsedTime backupWriteRate;
    private ElapsedTime backupWriteLoad;
    private ElapsedTime restoreReadBytes;
    private Availability restoreReadTime;
    private ElapsedTime restoreReadRate;
    private ElapsedTime restoreReadLoad;
    private ElapsedTime restoreWriteBytes;
    private Availability restoreWriteTime;
    private ElapsedTime restoreWriteRate;
    private ElapsedTime restoreWriteLoad;
    private ElapsedTime largeReadBytes;
    private Availability largeReadTime;
    private ElapsedTime largeReadRate;
    private ElapsedTime largeReadLoad;
    private ElapsedTime largeWriteBytes;
    private Availability largeWriteTime;
    private ElapsedTime largeWriteRate;
    private ElapsedTime largeWriteLoad;
    private ElapsedTime databaseReplicationReceiveBytes;
    private Availability databaseReplicationReceiveTime;
    private ElapsedTime databaseReplicationReceiveRate;
    private ElapsedTime databaseReplicationReceiveLoad;
    private ElapsedTime databaseReplicationSendBytes;
    private Availability databaseReplicationSendTime;
    private ElapsedTime databaseReplicationSendRate;
    private ElapsedTime databaseReplicationSendLoad;
    private ElapsedTime readLockCount;
    private Availability readLockWaitTime;
    private Availability readLockHoldTime;
    private ElapsedTime readLockRate;
    private ElapsedTime readLockWaitLoad;
    private ElapsedTime readLockHoldLoad;
    private ElapsedTime writeLockCount;
    private Availability writeLockWaitTime;
    private Availability writeLockHoldTime;
    private ElapsedTime writeLockRate;
    private ElapsedTime writeLockWaitLoad;
    private ElapsedTime writeLockHoldLoad;
    private ElapsedTime deadlockCount;
    private Availability deadlockWaitTime;
    private ElapsedTime deadlockRate;
    private ElapsedTime deadlockWaitLoad;
    private ElapsedTime largeBinaryCacheHits;
    private ElapsedTime largeBinaryCacheMisses;
    private ElapsedTime largeBinaryCacheHitRate;
    private ElapsedTime largeBinaryCacheMissRate;
    private Enabled sharedDiskFailoverActive;
    private Enabled retired;

    @JsonProperty("state")
    public Availability getState() { return state; }
    @JsonProperty("state")
    public void setState(Availability value) { this.state = value; }

    @JsonProperty("enabled")
    public Enabled getEnabled() { return enabled; }
    @JsonProperty("enabled")
    public void setEnabled(Enabled value) { this.enabled = value; }

    @JsonProperty("availability")
    public Availability getAvailability() { return availability; }
    @JsonProperty("availability")
    public void setAvailability(Availability value) { this.availability = value; }

    @JsonProperty("encryption")
    public Enabled getEncryption() { return encryption; }
    @JsonProperty("encryption")
    public void setEncryption(Enabled value) { this.encryption = value; }

    @JsonProperty("updates-allowed")
    public Availability getUpdatesAllowed() { return updatesAllowed; }
    @JsonProperty("updates-allowed")
    public void setUpdatesAllowed(Availability value) { this.updatesAllowed = value; }

    @JsonProperty("rebalancer-enable")
    public Enabled getRebalancerEnable() { return rebalancerEnable; }
    @JsonProperty("rebalancer-enable")
    public void setRebalancerEnable(Enabled value) { this.rebalancerEnable = value; }

    @JsonProperty("master-forest")
    public String getMasterForest() { return masterForest; }
    @JsonProperty("master-forest")
    public void setMasterForest(String value) { this.masterForest = value; }

    @JsonProperty("current-master-forest")
    public String getCurrentMasterForest() { return currentMasterForest; }
    @JsonProperty("current-master-forest")
    public void setCurrentMasterForest(String value) { this.currentMasterForest = value; }

    @JsonProperty("current-master-precise-time")
    public Availability getCurrentMasterPreciseTime() { return currentMasterPreciseTime; }
    @JsonProperty("current-master-precise-time")
    public void setCurrentMasterPreciseTime(Availability value) { this.currentMasterPreciseTime = value; }

    @JsonProperty("current-master-fsn")
    public ElapsedTime getCurrentMasterFsn() { return currentMasterFsn; }
    @JsonProperty("current-master-fsn")
    public void setCurrentMasterFsn(ElapsedTime value) { this.currentMasterFsn = value; }

    @JsonProperty("current-foreign-master-cluster")
    public Availability getCurrentForeignMasterCluster() { return currentForeignMasterCluster; }
    @JsonProperty("current-foreign-master-cluster")
    public void setCurrentForeignMasterCluster(Availability value) { this.currentForeignMasterCluster = value; }

    @JsonProperty("current-foreign-master-database")
    public String getCurrentForeignMasterDatabase() { return currentForeignMasterDatabase; }
    @JsonProperty("current-foreign-master-database")
    public void setCurrentForeignMasterDatabase(String value) { this.currentForeignMasterDatabase = value; }

    @JsonProperty("current-foreign-master-forest")
    public String getCurrentForeignMasterForest() { return currentForeignMasterForest; }
    @JsonProperty("current-foreign-master-forest")
    public void setCurrentForeignMasterForest(String value) { this.currentForeignMasterForest = value; }

    @JsonProperty("current-foreign-master-precise-time")
    public Availability getCurrentForeignMasterPreciseTime() { return currentForeignMasterPreciseTime; }
    @JsonProperty("current-foreign-master-precise-time")
    public void setCurrentForeignMasterPreciseTime(Availability value) { this.currentForeignMasterPreciseTime = value; }

    @JsonProperty("current-foreign-master-fsn")
    public ElapsedTime getCurrentForeignMasterFsn() { return currentForeignMasterFsn; }
    @JsonProperty("current-foreign-master-fsn")
    public void setCurrentForeignMasterFsn(ElapsedTime value) { this.currentForeignMasterFsn = value; }

    @JsonProperty("last-state-change")
    public Availability getLastStateChange() { return lastStateChange; }
    @JsonProperty("last-state-change")
    public void setLastStateChange(Availability value) { this.lastStateChange = value; }

    @JsonProperty("nonblocking-timestamp")
    public Availability getNonblockingTimestamp() { return nonblockingTimestamp; }
    @JsonProperty("nonblocking-timestamp")
    public void setNonblockingTimestamp(Availability value) { this.nonblockingTimestamp = value; }

    @JsonProperty("max-query-timestamp")
    public Availability getMaxQueryTimestamp() { return maxQueryTimestamp; }
    @JsonProperty("max-query-timestamp")
    public void setMaxQueryTimestamp(Availability value) { this.maxQueryTimestamp = value; }

    @JsonProperty("data-dir")
    public String getDataDir() { return dataDir; }
    @JsonProperty("data-dir")
    public void setDataDir(String value) { this.dataDir = value; }

    @JsonProperty("journals-size")
    public ElapsedTime getJournalsSize() { return journalsSize; }
    @JsonProperty("journals-size")
    public void setJournalsSize(ElapsedTime value) { this.journalsSize = value; }

    @JsonProperty("large-data-size")
    public ElapsedTime getLargeDataSize() { return largeDataSize; }
    @JsonProperty("large-data-size")
    public void setLargeDataSize(ElapsedTime value) { this.largeDataSize = value; }

    @JsonProperty("orphaned-binaries")
    public ElapsedTime getOrphanedBinaries() { return orphanedBinaries; }
    @JsonProperty("orphaned-binaries")
    public void setOrphanedBinaries(ElapsedTime value) { this.orphanedBinaries = value; }

    @JsonProperty("stand")
    public Stand[] getStand() { return stand; }
    @JsonProperty("stand")
    public void setStand(Stand[] value) { this.stand = value; }

    @JsonProperty("forest-reserve")
    public ElapsedTime getForestReserve() { return forestReserve; }
    @JsonProperty("forest-reserve")
    public void setForestReserve(ElapsedTime value) { this.forestReserve = value; }

    @JsonProperty("rebalancing")
    public Enabled getRebalancing() { return rebalancing; }
    @JsonProperty("rebalancing")
    public void setRebalancing(Enabled value) { this.rebalancing = value; }

    @JsonProperty("reindexing")
    public Enabled getReindexing() { return reindexing; }
    @JsonProperty("reindexing")
    public void setReindexing(Enabled value) { this.reindexing = value; }

    @JsonProperty("device-space")
    public ElapsedTime getDeviceSpace() { return deviceSpace; }
    @JsonProperty("device-space")
    public void setDeviceSpace(ElapsedTime value) { this.deviceSpace = value; }

    @JsonProperty("transaction-journal-size")
    public ElapsedTime getTransactionJournalSize() { return transactionJournalSize; }
    @JsonProperty("transaction-journal-size")
    public void setTransactionJournalSize(ElapsedTime value) { this.transactionJournalSize = value; }

    @JsonProperty("transaction-journal-limit")
    public ElapsedTime getTransactionJournalLimit() { return transactionJournalLimit; }
    @JsonProperty("transaction-journal-limit")
    public void setTransactionJournalLimit(ElapsedTime value) { this.transactionJournalLimit = value; }

    @JsonProperty("query-read-bytes")
    public ElapsedTime getQueryReadBytes() { return queryReadBytes; }
    @JsonProperty("query-read-bytes")
    public void setQueryReadBytes(ElapsedTime value) { this.queryReadBytes = value; }

    @JsonProperty("query-read-time")
    public Availability getQueryReadTime() { return queryReadTime; }
    @JsonProperty("query-read-time")
    public void setQueryReadTime(Availability value) { this.queryReadTime = value; }

    @JsonProperty("query-read-rate")
    public ElapsedTime getQueryReadRate() { return queryReadRate; }
    @JsonProperty("query-read-rate")
    public void setQueryReadRate(ElapsedTime value) { this.queryReadRate = value; }

    @JsonProperty("query-read-load")
    public ElapsedTime getQueryReadLoad() { return queryReadLoad; }
    @JsonProperty("query-read-load")
    public void setQueryReadLoad(ElapsedTime value) { this.queryReadLoad = value; }

    @JsonProperty("journal-write-bytes")
    public ElapsedTime getJournalWriteBytes() { return journalWriteBytes; }
    @JsonProperty("journal-write-bytes")
    public void setJournalWriteBytes(ElapsedTime value) { this.journalWriteBytes = value; }

    @JsonProperty("journal-write-time")
    public Availability getJournalWriteTime() { return journalWriteTime; }
    @JsonProperty("journal-write-time")
    public void setJournalWriteTime(Availability value) { this.journalWriteTime = value; }

    @JsonProperty("journal-write-rate")
    public ElapsedTime getJournalWriteRate() { return journalWriteRate; }
    @JsonProperty("journal-write-rate")
    public void setJournalWriteRate(ElapsedTime value) { this.journalWriteRate = value; }

    @JsonProperty("journal-write-load")
    public ElapsedTime getJournalWriteLoad() { return journalWriteLoad; }
    @JsonProperty("journal-write-load")
    public void setJournalWriteLoad(ElapsedTime value) { this.journalWriteLoad = value; }

    @JsonProperty("save-write-bytes")
    public ElapsedTime getSaveWriteBytes() { return saveWriteBytes; }
    @JsonProperty("save-write-bytes")
    public void setSaveWriteBytes(ElapsedTime value) { this.saveWriteBytes = value; }

    @JsonProperty("save-write-time")
    public Availability getSaveWriteTime() { return saveWriteTime; }
    @JsonProperty("save-write-time")
    public void setSaveWriteTime(Availability value) { this.saveWriteTime = value; }

    @JsonProperty("save-write-rate")
    public ElapsedTime getSaveWriteRate() { return saveWriteRate; }
    @JsonProperty("save-write-rate")
    public void setSaveWriteRate(ElapsedTime value) { this.saveWriteRate = value; }

    @JsonProperty("save-write-load")
    public ElapsedTime getSaveWriteLoad() { return saveWriteLoad; }
    @JsonProperty("save-write-load")
    public void setSaveWriteLoad(ElapsedTime value) { this.saveWriteLoad = value; }

    @JsonProperty("merge-read-bytes")
    public ElapsedTime getMergeReadBytes() { return mergeReadBytes; }
    @JsonProperty("merge-read-bytes")
    public void setMergeReadBytes(ElapsedTime value) { this.mergeReadBytes = value; }

    @JsonProperty("merge-read-time")
    public Availability getMergeReadTime() { return mergeReadTime; }
    @JsonProperty("merge-read-time")
    public void setMergeReadTime(Availability value) { this.mergeReadTime = value; }

    @JsonProperty("merge-read-rate")
    public ElapsedTime getMergeReadRate() { return mergeReadRate; }
    @JsonProperty("merge-read-rate")
    public void setMergeReadRate(ElapsedTime value) { this.mergeReadRate = value; }

    @JsonProperty("merge-read-load")
    public ElapsedTime getMergeReadLoad() { return mergeReadLoad; }
    @JsonProperty("merge-read-load")
    public void setMergeReadLoad(ElapsedTime value) { this.mergeReadLoad = value; }

    @JsonProperty("merge-write-bytes")
    public ElapsedTime getMergeWriteBytes() { return mergeWriteBytes; }
    @JsonProperty("merge-write-bytes")
    public void setMergeWriteBytes(ElapsedTime value) { this.mergeWriteBytes = value; }

    @JsonProperty("merge-write-time")
    public Availability getMergeWriteTime() { return mergeWriteTime; }
    @JsonProperty("merge-write-time")
    public void setMergeWriteTime(Availability value) { this.mergeWriteTime = value; }

    @JsonProperty("merge-write-rate")
    public ElapsedTime getMergeWriteRate() { return mergeWriteRate; }
    @JsonProperty("merge-write-rate")
    public void setMergeWriteRate(ElapsedTime value) { this.mergeWriteRate = value; }

    @JsonProperty("merge-write-load")
    public ElapsedTime getMergeWriteLoad() { return mergeWriteLoad; }
    @JsonProperty("merge-write-load")
    public void setMergeWriteLoad(ElapsedTime value) { this.mergeWriteLoad = value; }

    @JsonProperty("backup-read-bytes")
    public ElapsedTime getBackupReadBytes() { return backupReadBytes; }
    @JsonProperty("backup-read-bytes")
    public void setBackupReadBytes(ElapsedTime value) { this.backupReadBytes = value; }

    @JsonProperty("backup-read-time")
    public Availability getBackupReadTime() { return backupReadTime; }
    @JsonProperty("backup-read-time")
    public void setBackupReadTime(Availability value) { this.backupReadTime = value; }

    @JsonProperty("backup-read-rate")
    public ElapsedTime getBackupReadRate() { return backupReadRate; }
    @JsonProperty("backup-read-rate")
    public void setBackupReadRate(ElapsedTime value) { this.backupReadRate = value; }

    @JsonProperty("backup-read-load")
    public ElapsedTime getBackupReadLoad() { return backupReadLoad; }
    @JsonProperty("backup-read-load")
    public void setBackupReadLoad(ElapsedTime value) { this.backupReadLoad = value; }

    @JsonProperty("backup-write-bytes")
    public ElapsedTime getBackupWriteBytes() { return backupWriteBytes; }
    @JsonProperty("backup-write-bytes")
    public void setBackupWriteBytes(ElapsedTime value) { this.backupWriteBytes = value; }

    @JsonProperty("backup-write-time")
    public Availability getBackupWriteTime() { return backupWriteTime; }
    @JsonProperty("backup-write-time")
    public void setBackupWriteTime(Availability value) { this.backupWriteTime = value; }

    @JsonProperty("backup-write-rate")
    public ElapsedTime getBackupWriteRate() { return backupWriteRate; }
    @JsonProperty("backup-write-rate")
    public void setBackupWriteRate(ElapsedTime value) { this.backupWriteRate = value; }

    @JsonProperty("backup-write-load")
    public ElapsedTime getBackupWriteLoad() { return backupWriteLoad; }
    @JsonProperty("backup-write-load")
    public void setBackupWriteLoad(ElapsedTime value) { this.backupWriteLoad = value; }

    @JsonProperty("restore-read-bytes")
    public ElapsedTime getRestoreReadBytes() { return restoreReadBytes; }
    @JsonProperty("restore-read-bytes")
    public void setRestoreReadBytes(ElapsedTime value) { this.restoreReadBytes = value; }

    @JsonProperty("restore-read-time")
    public Availability getRestoreReadTime() { return restoreReadTime; }
    @JsonProperty("restore-read-time")
    public void setRestoreReadTime(Availability value) { this.restoreReadTime = value; }

    @JsonProperty("restore-read-rate")
    public ElapsedTime getRestoreReadRate() { return restoreReadRate; }
    @JsonProperty("restore-read-rate")
    public void setRestoreReadRate(ElapsedTime value) { this.restoreReadRate = value; }

    @JsonProperty("restore-read-load")
    public ElapsedTime getRestoreReadLoad() { return restoreReadLoad; }
    @JsonProperty("restore-read-load")
    public void setRestoreReadLoad(ElapsedTime value) { this.restoreReadLoad = value; }

    @JsonProperty("restore-write-bytes")
    public ElapsedTime getRestoreWriteBytes() { return restoreWriteBytes; }
    @JsonProperty("restore-write-bytes")
    public void setRestoreWriteBytes(ElapsedTime value) { this.restoreWriteBytes = value; }

    @JsonProperty("restore-write-time")
    public Availability getRestoreWriteTime() { return restoreWriteTime; }
    @JsonProperty("restore-write-time")
    public void setRestoreWriteTime(Availability value) { this.restoreWriteTime = value; }

    @JsonProperty("restore-write-rate")
    public ElapsedTime getRestoreWriteRate() { return restoreWriteRate; }
    @JsonProperty("restore-write-rate")
    public void setRestoreWriteRate(ElapsedTime value) { this.restoreWriteRate = value; }

    @JsonProperty("restore-write-load")
    public ElapsedTime getRestoreWriteLoad() { return restoreWriteLoad; }
    @JsonProperty("restore-write-load")
    public void setRestoreWriteLoad(ElapsedTime value) { this.restoreWriteLoad = value; }

    @JsonProperty("large-read-bytes")
    public ElapsedTime getLargeReadBytes() { return largeReadBytes; }
    @JsonProperty("large-read-bytes")
    public void setLargeReadBytes(ElapsedTime value) { this.largeReadBytes = value; }

    @JsonProperty("large-read-time")
    public Availability getLargeReadTime() { return largeReadTime; }
    @JsonProperty("large-read-time")
    public void setLargeReadTime(Availability value) { this.largeReadTime = value; }

    @JsonProperty("large-read-rate")
    public ElapsedTime getLargeReadRate() { return largeReadRate; }
    @JsonProperty("large-read-rate")
    public void setLargeReadRate(ElapsedTime value) { this.largeReadRate = value; }

    @JsonProperty("large-read-load")
    public ElapsedTime getLargeReadLoad() { return largeReadLoad; }
    @JsonProperty("large-read-load")
    public void setLargeReadLoad(ElapsedTime value) { this.largeReadLoad = value; }

    @JsonProperty("large-write-bytes")
    public ElapsedTime getLargeWriteBytes() { return largeWriteBytes; }
    @JsonProperty("large-write-bytes")
    public void setLargeWriteBytes(ElapsedTime value) { this.largeWriteBytes = value; }

    @JsonProperty("large-write-time")
    public Availability getLargeWriteTime() { return largeWriteTime; }
    @JsonProperty("large-write-time")
    public void setLargeWriteTime(Availability value) { this.largeWriteTime = value; }

    @JsonProperty("large-write-rate")
    public ElapsedTime getLargeWriteRate() { return largeWriteRate; }
    @JsonProperty("large-write-rate")
    public void setLargeWriteRate(ElapsedTime value) { this.largeWriteRate = value; }

    @JsonProperty("large-write-load")
    public ElapsedTime getLargeWriteLoad() { return largeWriteLoad; }
    @JsonProperty("large-write-load")
    public void setLargeWriteLoad(ElapsedTime value) { this.largeWriteLoad = value; }

    @JsonProperty("database-replication-receive-bytes")
    public ElapsedTime getDatabaseReplicationReceiveBytes() { return databaseReplicationReceiveBytes; }
    @JsonProperty("database-replication-receive-bytes")
    public void setDatabaseReplicationReceiveBytes(ElapsedTime value) { this.databaseReplicationReceiveBytes = value; }

    @JsonProperty("database-replication-receive-time")
    public Availability getDatabaseReplicationReceiveTime() { return databaseReplicationReceiveTime; }
    @JsonProperty("database-replication-receive-time")
    public void setDatabaseReplicationReceiveTime(Availability value) { this.databaseReplicationReceiveTime = value; }

    @JsonProperty("database-replication-receive-rate")
    public ElapsedTime getDatabaseReplicationReceiveRate() { return databaseReplicationReceiveRate; }
    @JsonProperty("database-replication-receive-rate")
    public void setDatabaseReplicationReceiveRate(ElapsedTime value) { this.databaseReplicationReceiveRate = value; }

    @JsonProperty("database-replication-receive-load")
    public ElapsedTime getDatabaseReplicationReceiveLoad() { return databaseReplicationReceiveLoad; }
    @JsonProperty("database-replication-receive-load")
    public void setDatabaseReplicationReceiveLoad(ElapsedTime value) { this.databaseReplicationReceiveLoad = value; }

    @JsonProperty("database-replication-send-bytes")
    public ElapsedTime getDatabaseReplicationSendBytes() { return databaseReplicationSendBytes; }
    @JsonProperty("database-replication-send-bytes")
    public void setDatabaseReplicationSendBytes(ElapsedTime value) { this.databaseReplicationSendBytes = value; }

    @JsonProperty("database-replication-send-time")
    public Availability getDatabaseReplicationSendTime() { return databaseReplicationSendTime; }
    @JsonProperty("database-replication-send-time")
    public void setDatabaseReplicationSendTime(Availability value) { this.databaseReplicationSendTime = value; }

    @JsonProperty("database-replication-send-rate")
    public ElapsedTime getDatabaseReplicationSendRate() { return databaseReplicationSendRate; }
    @JsonProperty("database-replication-send-rate")
    public void setDatabaseReplicationSendRate(ElapsedTime value) { this.databaseReplicationSendRate = value; }

    @JsonProperty("database-replication-send-load")
    public ElapsedTime getDatabaseReplicationSendLoad() { return databaseReplicationSendLoad; }
    @JsonProperty("database-replication-send-load")
    public void setDatabaseReplicationSendLoad(ElapsedTime value) { this.databaseReplicationSendLoad = value; }

    @JsonProperty("read-lock-count")
    public ElapsedTime getReadLockCount() { return readLockCount; }
    @JsonProperty("read-lock-count")
    public void setReadLockCount(ElapsedTime value) { this.readLockCount = value; }

    @JsonProperty("read-lock-wait-time")
    public Availability getReadLockWaitTime() { return readLockWaitTime; }
    @JsonProperty("read-lock-wait-time")
    public void setReadLockWaitTime(Availability value) { this.readLockWaitTime = value; }

    @JsonProperty("read-lock-hold-time")
    public Availability getReadLockHoldTime() { return readLockHoldTime; }
    @JsonProperty("read-lock-hold-time")
    public void setReadLockHoldTime(Availability value) { this.readLockHoldTime = value; }

    @JsonProperty("read-lock-rate")
    public ElapsedTime getReadLockRate() { return readLockRate; }
    @JsonProperty("read-lock-rate")
    public void setReadLockRate(ElapsedTime value) { this.readLockRate = value; }

    @JsonProperty("read-lock-wait-load")
    public ElapsedTime getReadLockWaitLoad() { return readLockWaitLoad; }
    @JsonProperty("read-lock-wait-load")
    public void setReadLockWaitLoad(ElapsedTime value) { this.readLockWaitLoad = value; }

    @JsonProperty("read-lock-hold-load")
    public ElapsedTime getReadLockHoldLoad() { return readLockHoldLoad; }
    @JsonProperty("read-lock-hold-load")
    public void setReadLockHoldLoad(ElapsedTime value) { this.readLockHoldLoad = value; }

    @JsonProperty("write-lock-count")
    public ElapsedTime getWriteLockCount() { return writeLockCount; }
    @JsonProperty("write-lock-count")
    public void setWriteLockCount(ElapsedTime value) { this.writeLockCount = value; }

    @JsonProperty("write-lock-wait-time")
    public Availability getWriteLockWaitTime() { return writeLockWaitTime; }
    @JsonProperty("write-lock-wait-time")
    public void setWriteLockWaitTime(Availability value) { this.writeLockWaitTime = value; }

    @JsonProperty("write-lock-hold-time")
    public Availability getWriteLockHoldTime() { return writeLockHoldTime; }
    @JsonProperty("write-lock-hold-time")
    public void setWriteLockHoldTime(Availability value) { this.writeLockHoldTime = value; }

    @JsonProperty("write-lock-rate")
    public ElapsedTime getWriteLockRate() { return writeLockRate; }
    @JsonProperty("write-lock-rate")
    public void setWriteLockRate(ElapsedTime value) { this.writeLockRate = value; }

    @JsonProperty("write-lock-wait-load")
    public ElapsedTime getWriteLockWaitLoad() { return writeLockWaitLoad; }
    @JsonProperty("write-lock-wait-load")
    public void setWriteLockWaitLoad(ElapsedTime value) { this.writeLockWaitLoad = value; }

    @JsonProperty("write-lock-hold-load")
    public ElapsedTime getWriteLockHoldLoad() { return writeLockHoldLoad; }
    @JsonProperty("write-lock-hold-load")
    public void setWriteLockHoldLoad(ElapsedTime value) { this.writeLockHoldLoad = value; }

    @JsonProperty("deadlock-count")
    public ElapsedTime getDeadlockCount() { return deadlockCount; }
    @JsonProperty("deadlock-count")
    public void setDeadlockCount(ElapsedTime value) { this.deadlockCount = value; }

    @JsonProperty("deadlock-wait-time")
    public Availability getDeadlockWaitTime() { return deadlockWaitTime; }
    @JsonProperty("deadlock-wait-time")
    public void setDeadlockWaitTime(Availability value) { this.deadlockWaitTime = value; }

    @JsonProperty("deadlock-rate")
    public ElapsedTime getDeadlockRate() { return deadlockRate; }
    @JsonProperty("deadlock-rate")
    public void setDeadlockRate(ElapsedTime value) { this.deadlockRate = value; }

    @JsonProperty("deadlock-wait-load")
    public ElapsedTime getDeadlockWaitLoad() { return deadlockWaitLoad; }
    @JsonProperty("deadlock-wait-load")
    public void setDeadlockWaitLoad(ElapsedTime value) { this.deadlockWaitLoad = value; }

    @JsonProperty("large-binary-cache-hits")
    public ElapsedTime getLargeBinaryCacheHits() { return largeBinaryCacheHits; }
    @JsonProperty("large-binary-cache-hits")
    public void setLargeBinaryCacheHits(ElapsedTime value) { this.largeBinaryCacheHits = value; }

    @JsonProperty("large-binary-cache-misses")
    public ElapsedTime getLargeBinaryCacheMisses() { return largeBinaryCacheMisses; }
    @JsonProperty("large-binary-cache-misses")
    public void setLargeBinaryCacheMisses(ElapsedTime value) { this.largeBinaryCacheMisses = value; }

    @JsonProperty("large-binary-cache-hit-rate")
    public ElapsedTime getLargeBinaryCacheHitRate() { return largeBinaryCacheHitRate; }
    @JsonProperty("large-binary-cache-hit-rate")
    public void setLargeBinaryCacheHitRate(ElapsedTime value) { this.largeBinaryCacheHitRate = value; }

    @JsonProperty("large-binary-cache-miss-rate")
    public ElapsedTime getLargeBinaryCacheMissRate() { return largeBinaryCacheMissRate; }
    @JsonProperty("large-binary-cache-miss-rate")
    public void setLargeBinaryCacheMissRate(ElapsedTime value) { this.largeBinaryCacheMissRate = value; }

    @JsonProperty("shared-disk-failover-active")
    public Enabled getSharedDiskFailoverActive() { return sharedDiskFailoverActive; }
    @JsonProperty("shared-disk-failover-active")
    public void setSharedDiskFailoverActive(Enabled value) { this.sharedDiskFailoverActive = value; }

    @JsonProperty("retired")
    public Enabled getRetired() { return retired; }
    @JsonProperty("retired")
    public void setRetired(Enabled value) { this.retired = value; }
}

