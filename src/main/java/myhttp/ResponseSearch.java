// SearchResponse.java

package myhttp;

import com.fasterxml.jackson.annotation.*;

public class ResponseSearch {
    private String snippetFormat;
    private long total;
    private long start;
    private long pageLength;
    private SearchResult[] results;
    private String qtext;
    private SearchMetrics metrics;

    @JsonProperty("snippet-format")
    public String getSnippetFormat() { return snippetFormat; }
    @JsonProperty("snippet-format")
    public void setSnippetFormat(String value) { this.snippetFormat = value; }

    @JsonProperty("total")
    public long getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(long value) { this.total = value; }

    @JsonProperty("start")
    public long getStart() { return start; }
    @JsonProperty("start")
    public void setStart(long value) { this.start = value; }

    @JsonProperty("page-length")
    public long getPageLength() { return pageLength; }
    @JsonProperty("page-length")
    public void setPageLength(long value) { this.pageLength = value; }

    @JsonProperty("results")
    public SearchResult[] getResults() { return results; }
    @JsonProperty("results")
    public void setResults(SearchResult[] value) { this.results = value; }

    @JsonProperty("qtext")
    public String getQtext() { return qtext; }
    @JsonProperty("qtext")
    public void setQtext(String value) { this.qtext = value; }

    @JsonProperty("metrics")
    public SearchMetrics getMetrics() { return metrics; }
    @JsonProperty("metrics")
    public void setMetrics(SearchMetrics value) { this.metrics = value; }
}