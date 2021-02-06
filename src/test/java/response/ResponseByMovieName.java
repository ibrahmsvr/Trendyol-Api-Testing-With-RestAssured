package response;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "Search",
        "totalResults",
        "Response"
})

public class ResponseByMovieName {
    @JsonProperty("Search")
    private List<SearchByMovieNameDetail> search = null;
    @JsonProperty("totalResults")
    private String totalResults;
    @JsonProperty("Response")
    private String response;

    @JsonProperty("Search")
    public List<SearchByMovieNameDetail> getSearch() { return this.search; }

    @JsonProperty("totalResults")
    public String getTotalResults() {
        return this.totalResults;
    }

    @JsonProperty("Response")
    public String getResponse() {
        return this.response;
    }


}

