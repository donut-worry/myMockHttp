// Result.java

package myhttp;

import com.fasterxml.jackson.annotation.*;

public class SearchResult {
    private long index;
    private String uri;
    private String path;
    private long score;
    private double confidence;
    private double fitness;
    private String href;
    private Mimetype mimetype;
    private SearchFormat format;
    private Match[] matches;

    @JsonProperty("index")
    public long getIndex() { return index; }
    @JsonProperty("index")
    public void setIndex(long value) { this.index = value; }

    @JsonProperty("uri")
    public String getURI() { return uri; }
    @JsonProperty("uri")
    public void setURI(String value) { this.uri = value; }

    @JsonProperty("path")
    public String getPath() { return path; }
    @JsonProperty("path")
    public void setPath(String value) { this.path = value; }

    @JsonProperty("score")
    public long getScore() { return score; }
    @JsonProperty("score")
    public void setScore(long value) { this.score = value; }

    @JsonProperty("confidence")
    public double getConfidence() { return confidence; }
    @JsonProperty("confidence")
    public void setConfidence(double value) { this.confidence = value; }

    @JsonProperty("fitness")
    public double getFitness() { return fitness; }
    @JsonProperty("fitness")
    public void setFitness(double value) { this.fitness = value; }

    @JsonProperty("href")
    public String getHref() { return href; }
    @JsonProperty("href")
    public void setHref(String value) { this.href = value; }

    @JsonProperty("mimetype")
    public Mimetype getMimetype() { return mimetype; }
    @JsonProperty("mimetype")
    public void setMimetype(Mimetype value) { this.mimetype = value; }

    @JsonProperty("format")
    public SearchFormat getFormat() { return format; }
    @JsonProperty("format")
    public void setFormat(SearchFormat value) { this.format = value; }

    @JsonProperty("matches")
    public Match[] getMatches() { return matches; }
    @JsonProperty("matches")
    public void setMatches(Match[] value) { this.matches = value; }
}