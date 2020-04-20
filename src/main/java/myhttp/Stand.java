// Stand.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class Stand {
    private String[] standID;
    private String path;
    private Availability standKind;
    private Enabled isFast;
    private ElapsedTime labelVersion;
    private ElapsedTime diskSize;
    private ElapsedTime encryptedDiskSize;
    private ElapsedTime memorySize;
    private ElapsedTime listCacheHits;
    private ElapsedTime listCacheMisses;
    private ElapsedTime listCacheHitRate;
    private ElapsedTime listCacheMissRate;
    private ElapsedTime compressedTreeCacheHits;
    private ElapsedTime compressedTreeCacheMisses;
    private ElapsedTime compressedTreeCacheHitRate;
    private ElapsedTime compressedTreeCacheMissRate;
    private ElapsedTime tripleCacheHits;
    private ElapsedTime tripleCacheMisses;
    private ElapsedTime tripleCacheHitRate;
    private ElapsedTime tripleCacheMissRate;
    private ElapsedTime tripleValueCacheHits;
    private ElapsedTime tripleValueCacheMisses;
    private ElapsedTime tripleValueCacheHitRate;
    private ElapsedTime tripleValueCacheMissRate;

    @JsonProperty("stand-id")
    public String[] getStandID() { return standID; }
    @JsonProperty("stand-id")
    public void setStandID(String[] value) { this.standID = value; }

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("stand-kind")
    public Availability getStandKind() { return standKind; }
    @JsonProperty("stand-kind")
    public void setStandKind(Availability value) { this.standKind = value; }

    @JsonProperty("is-fast")
    public Enabled getIsFast() { return isFast; }
    @JsonProperty("is-fast")
    public void setIsFast(Enabled value) { this.isFast = value; }

    @JsonProperty("label-version")
    public ElapsedTime getLabelVersion() { return labelVersion; }
    @JsonProperty("label-version")
    public void setLabelVersion(ElapsedTime value) { this.labelVersion = value; }

    @JsonProperty("disk-size")
    public ElapsedTime getDiskSize() { return diskSize; }
    @JsonProperty("disk-size")
    public void setDiskSize(ElapsedTime value) { this.diskSize = value; }

    @JsonProperty("encrypted-disk-size")
    public ElapsedTime getEncryptedDiskSize() { return encryptedDiskSize; }
    @JsonProperty("encrypted-disk-size")
    public void setEncryptedDiskSize(ElapsedTime value) { this.encryptedDiskSize = value; }

    @JsonProperty("memory-size")
    public ElapsedTime getMemorySize() { return memorySize; }
    @JsonProperty("memory-size")
    public void setMemorySize(ElapsedTime value) { this.memorySize = value; }

    @JsonProperty("list-cache-hits")
    public ElapsedTime getListCacheHits() { return listCacheHits; }
    @JsonProperty("list-cache-hits")
    public void setListCacheHits(ElapsedTime value) { this.listCacheHits = value; }

    @JsonProperty("list-cache-misses")
    public ElapsedTime getListCacheMisses() { return listCacheMisses; }
    @JsonProperty("list-cache-misses")
    public void setListCacheMisses(ElapsedTime value) { this.listCacheMisses = value; }

    @JsonProperty("list-cache-hit-rate")
    public ElapsedTime getListCacheHitRate() { return listCacheHitRate; }
    @JsonProperty("list-cache-hit-rate")
    public void setListCacheHitRate(ElapsedTime value) { this.listCacheHitRate = value; }

    @JsonProperty("list-cache-miss-rate")
    public ElapsedTime getListCacheMissRate() { return listCacheMissRate; }
    @JsonProperty("list-cache-miss-rate")
    public void setListCacheMissRate(ElapsedTime value) { this.listCacheMissRate = value; }

    @JsonProperty("compressed-tree-cache-hits")
    public ElapsedTime getCompressedTreeCacheHits() { return compressedTreeCacheHits; }
    @JsonProperty("compressed-tree-cache-hits")
    public void setCompressedTreeCacheHits(ElapsedTime value) { this.compressedTreeCacheHits = value; }

    @JsonProperty("compressed-tree-cache-misses")
    public ElapsedTime getCompressedTreeCacheMisses() { return compressedTreeCacheMisses; }
    @JsonProperty("compressed-tree-cache-misses")
    public void setCompressedTreeCacheMisses(ElapsedTime value) { this.compressedTreeCacheMisses = value; }

    @JsonProperty("compressed-tree-cache-hit-rate")
    public ElapsedTime getCompressedTreeCacheHitRate() { return compressedTreeCacheHitRate; }
    @JsonProperty("compressed-tree-cache-hit-rate")
    public void setCompressedTreeCacheHitRate(ElapsedTime value) { this.compressedTreeCacheHitRate = value; }

    @JsonProperty("compressed-tree-cache-miss-rate")
    public ElapsedTime getCompressedTreeCacheMissRate() { return compressedTreeCacheMissRate; }
    @JsonProperty("compressed-tree-cache-miss-rate")
    public void setCompressedTreeCacheMissRate(ElapsedTime value) { this.compressedTreeCacheMissRate = value; }

    @JsonProperty("triple-cache-hits")
    public ElapsedTime getTripleCacheHits() { return tripleCacheHits; }
    @JsonProperty("triple-cache-hits")
    public void setTripleCacheHits(ElapsedTime value) { this.tripleCacheHits = value; }

    @JsonProperty("triple-cache-misses")
    public ElapsedTime getTripleCacheMisses() { return tripleCacheMisses; }
    @JsonProperty("triple-cache-misses")
    public void setTripleCacheMisses(ElapsedTime value) { this.tripleCacheMisses = value; }

    @JsonProperty("triple-cache-hit-rate")
    public ElapsedTime getTripleCacheHitRate() { return tripleCacheHitRate; }
    @JsonProperty("triple-cache-hit-rate")
    public void setTripleCacheHitRate(ElapsedTime value) { this.tripleCacheHitRate = value; }

    @JsonProperty("triple-cache-miss-rate")
    public ElapsedTime getTripleCacheMissRate() { return tripleCacheMissRate; }
    @JsonProperty("triple-cache-miss-rate")
    public void setTripleCacheMissRate(ElapsedTime value) { this.tripleCacheMissRate = value; }

    @JsonProperty("triple-value-cache-hits")
    public ElapsedTime getTripleValueCacheHits() { return tripleValueCacheHits; }
    @JsonProperty("triple-value-cache-hits")
    public void setTripleValueCacheHits(ElapsedTime value) { this.tripleValueCacheHits = value; }

    @JsonProperty("triple-value-cache-misses")
    public ElapsedTime getTripleValueCacheMisses() { return tripleValueCacheMisses; }
    @JsonProperty("triple-value-cache-misses")
    public void setTripleValueCacheMisses(ElapsedTime value) { this.tripleValueCacheMisses = value; }

    @JsonProperty("triple-value-cache-hit-rate")
    public ElapsedTime getTripleValueCacheHitRate() { return tripleValueCacheHitRate; }
    @JsonProperty("triple-value-cache-hit-rate")
    public void setTripleValueCacheHitRate(ElapsedTime value) { this.tripleValueCacheHitRate = value; }

    @JsonProperty("triple-value-cache-miss-rate")
    public ElapsedTime getTripleValueCacheMissRate() { return tripleValueCacheMissRate; }
    @JsonProperty("triple-value-cache-miss-rate")
    public void setTripleValueCacheMissRate(ElapsedTime value) { this.tripleValueCacheMissRate = value; }
}
