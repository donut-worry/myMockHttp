// CacheProperties.java

package myhttp;

import java.util.*;
import com.fasterxml.jackson.annotation.*;

public class DatabaseCacheProperties {
    private ElapsedTime listCacheHitRate;
    private ElapsedTime listCacheMissRate;
    private ElapsedTime tripleCacheHitRate;
    private ElapsedTime tripleCacheMissRate;
    private ElapsedTime tripleValueCacheHitRate;
    private ElapsedTime tripleValueCacheMissRate;
    private ElapsedTime compressedTreeCacheHitRate;
    private ElapsedTime compressedTreeCacheMissRate;
    private ElapsedTime largeBinaryCacheHitRate;
    private ElapsedTime largeBinaryCacheMissRate;

    @JsonProperty("list-cache-hit-rate")
    public ElapsedTime getListCacheHitRate() { return listCacheHitRate; }
    @JsonProperty("list-cache-hit-rate")
    public void setListCacheHitRate(ElapsedTime value) { this.listCacheHitRate = value; }

    @JsonProperty("list-cache-miss-rate")
    public ElapsedTime getListCacheMissRate() { return listCacheMissRate; }
    @JsonProperty("list-cache-miss-rate")
    public void setListCacheMissRate(ElapsedTime value) { this.listCacheMissRate = value; }

    @JsonProperty("triple-cache-hit-rate")
    public ElapsedTime getTripleCacheHitRate() { return tripleCacheHitRate; }
    @JsonProperty("triple-cache-hit-rate")
    public void setTripleCacheHitRate(ElapsedTime value) { this.tripleCacheHitRate = value; }

    @JsonProperty("triple-cache-miss-rate")
    public ElapsedTime getTripleCacheMissRate() { return tripleCacheMissRate; }
    @JsonProperty("triple-cache-miss-rate")
    public void setTripleCacheMissRate(ElapsedTime value) { this.tripleCacheMissRate = value; }

    @JsonProperty("triple-value-cache-hit-rate")
    public ElapsedTime getTripleValueCacheHitRate() { return tripleValueCacheHitRate; }
    @JsonProperty("triple-value-cache-hit-rate")
    public void setTripleValueCacheHitRate(ElapsedTime value) { this.tripleValueCacheHitRate = value; }

    @JsonProperty("triple-value-cache-miss-rate")
    public ElapsedTime getTripleValueCacheMissRate() { return tripleValueCacheMissRate; }
    @JsonProperty("triple-value-cache-miss-rate")
    public void setTripleValueCacheMissRate(ElapsedTime value) { this.tripleValueCacheMissRate = value; }

    @JsonProperty("compressed-tree-cache-hit-rate")
    public ElapsedTime getCompressedTreeCacheHitRate() { return compressedTreeCacheHitRate; }
    @JsonProperty("compressed-tree-cache-hit-rate")
    public void setCompressedTreeCacheHitRate(ElapsedTime value) { this.compressedTreeCacheHitRate = value; }

    @JsonProperty("compressed-tree-cache-miss-rate")
    public ElapsedTime getCompressedTreeCacheMissRate() { return compressedTreeCacheMissRate; }
    @JsonProperty("compressed-tree-cache-miss-rate")
    public void setCompressedTreeCacheMissRate(ElapsedTime value) { this.compressedTreeCacheMissRate = value; }

    @JsonProperty("large-binary-cache-hit-rate")
    public ElapsedTime getLargeBinaryCacheHitRate() { return largeBinaryCacheHitRate; }
    @JsonProperty("large-binary-cache-hit-rate")
    public void setLargeBinaryCacheHitRate(ElapsedTime value) { this.largeBinaryCacheHitRate = value; }

    @JsonProperty("large-binary-cache-miss-rate")
    public ElapsedTime getLargeBinaryCacheMissRate() { return largeBinaryCacheMissRate; }
    @JsonProperty("large-binary-cache-miss-rate")
    public void setLargeBinaryCacheMissRate(ElapsedTime value) { this.largeBinaryCacheMissRate = value; }
}