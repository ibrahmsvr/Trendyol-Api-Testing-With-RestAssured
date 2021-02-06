package response;

import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@JsonPropertyOrder({
        "Source",
        "Value"
})

public class SearchByImdbIdDetail {

    @JsonProperty("Source")
    private String source;
    @JsonProperty("Value")
    private String value;

    @JsonProperty("Source")
    public String getSource() {
        return this.source;
    }

    @JsonProperty("Value")
    public String getValue() {
        return this.value;
    }
}
