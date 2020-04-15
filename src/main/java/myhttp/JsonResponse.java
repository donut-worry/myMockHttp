package myhttp;

import com.fasterxml.jackson.annotation.*;

public class JsonResponse {
    private String page;
    private long perPage;
    private long total;
    private long totalPages;
    private JsonResponseData[] data;

    @Override
    public String toString() {
        return "JsonResponse (from java object) : {" +
                "page='" + page + '\'' +
                ", perPage=" + perPage +
                ", total=" + total +
                ", totalPages=" + totalPages +
                '}';
    }

    @JsonProperty("page")
    public String getPage() { return page; }
    @JsonProperty("page")
    public void setPage(String value) { this.page = value; }

    @JsonProperty("per_page")
    public long getPerPage() { return perPage; }
    @JsonProperty("per_page")
    public void setPerPage(long value) { this.perPage = value; }

    @JsonProperty("total")
    public long getTotal() { return total; }
    @JsonProperty("total")
    public void setTotal(long value) { this.total = value; }

    @JsonProperty("total_pages")
    public long getTotalPages() { return totalPages; }
    @JsonProperty("total_pages")
    public void setTotalPages(long value) { this.totalPages = value; }

    @JsonProperty("data")
    public JsonResponseData[] getData() { return data; }
    @JsonProperty("data")
    public void setData(JsonResponseData[] value) { this.data = value; }
}
