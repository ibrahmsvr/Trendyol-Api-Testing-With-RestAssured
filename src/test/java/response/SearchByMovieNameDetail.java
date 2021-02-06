package response;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "Title",
        "Year",
        "imdbID",
        "Type",
        "Poster"
})

public class SearchByMovieNameDetail {

    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Poster")
    private String poster;

    @JsonProperty("Title")
    public String getTitle() {
        return this.title;
    }

    @JsonProperty("Year")
    public String getYear() {
        return this.year;
    }

    @JsonProperty("imdbID")
    public String getImdbID() {
        return this.imdbID;
    }

    @JsonProperty("Type")
    public String getType() {
        return this.type;
    }


    @JsonProperty("Poster")
    public String getPoster() {
        return poster;
    }

}
