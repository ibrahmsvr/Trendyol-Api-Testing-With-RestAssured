package response;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.util.List;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "Title",
        "Year",
        "Rated",
        "Released",
        "Runtime",
        "Genre",
        "Director",
        "Writer",
        "Actors",
        "Plot",
        "Language",
        "Country",
        "Awards",
        "Poster",
        "Ratings",
        "Metascore",
        "imdbRating",
        "imdbVotes",
        "imdbID",
        "Type",
        "DVD",
        "BoxOffice",
        "Production",
        "Website",
        "Response",
})

public class ResponseByImdbId {
    @JsonProperty("Title")
    private String title;
    @JsonProperty("Year")
    private String year;
    @JsonProperty("Rated")
    private String rated;
    @JsonProperty("Released")
    private String released;
    @JsonProperty("Runtime")
    private String runtime;
    @JsonProperty("Genre")
    private String genre;
    @JsonProperty("Director")
    private String director;
    @JsonProperty("Writer")
    private String writer;
    @JsonProperty("Actors")
    private String actors;
    @JsonProperty("Plot")
    private String plot;
    @JsonProperty("Language")
    private String language;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("Awards")
    private String awards;
    @JsonProperty("Poster")
    private String poster;
    @JsonProperty("Ratings")
    private List<SearchByImdbIdDetail> ratings = null;
    @JsonProperty("Metascore")
    private String metascore;
    @JsonProperty("imdbRating")
    private String imdbRating;
    @JsonProperty("imdbVotes")
    private String imdbVotes;
    @JsonProperty("imdbID")
    private String imdbID;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("DVD")
    private String dVD;
    @JsonProperty("BoxOffice")
    private String boxOffice;
    @JsonProperty("Production")
    private String production;
    @JsonProperty("Website")
    private String website;
    @JsonProperty("Response")
    private String response;

    @JsonProperty("Title")
    public String getTitle() {
        return this.title;
    }

    @JsonProperty("Year")
    public String getYear() {
        return this.year;
    }

    @JsonProperty("Rated")
    public String getRated() {
        return this.rated;
    }

    @JsonProperty("Released")
    public String getReleased() {
        return this.released;
    }

    @JsonProperty("Runtime")
    public String getRuntime() {
        return this.runtime;
    }

    @JsonProperty("Genre")
    public String getGenre() {
        return this.genre;
    }

    @JsonProperty("Director")
    public String getDirector() {
        return this.director;
    }

    @JsonProperty("Writer")
    public String getWriter() {
        return this.writer;
    }

    @JsonProperty("Actors")
    public String getActors() {
        return this.actors;
    }

    @JsonProperty("Plot")
    public String getPlot() {
        return this.plot;
    }

    @JsonProperty("Language")
    public String getLanguage() {
        return this.language;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return this.country;
    }

    @JsonProperty("Awards")
    public String getAwards() {
        return this.awards;
    }

    @JsonProperty("Poster")
    public String getPoster() {
        return this.poster;
    }

    @JsonProperty("Ratings")
    public List<SearchByImdbIdDetail> getRatings() {
        return this.ratings;
    }

    @JsonProperty("Metascore")
    public String getMetascore() {
        return this.metascore;
    }

    @JsonProperty("imdbRating")
    public String getImdbRating() {
        return this.imdbRating;
    }

    @JsonProperty("imdbVotes")
    public String getImdbVotes() {
        return this.imdbVotes;
    }

    @JsonProperty("imdbID")
    public String getImdbID() {
        return this.imdbID;
    }

    @JsonProperty("Type")
    public String getType() {
        return this.type;
    }

    @JsonProperty("DVD")
    public String getDVD() {
        return this.dVD;
    }

    @JsonProperty("BoxOffice")
    public String getBoxOffice() {
        return this.boxOffice;
    }

    @JsonProperty("Production")
    public String getProduction() {
        return this.production;
    }

    @JsonProperty("Website")
    public String getWebsite() {
        return this.website;
    }

    @JsonProperty("Response")
    public String getResponse() {
        return this.response;
    }
}