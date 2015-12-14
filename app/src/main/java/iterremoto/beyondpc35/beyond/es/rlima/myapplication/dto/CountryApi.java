package iterremoto.beyondpc35.beyond.es.rlima.myapplication.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by BEYONDPC35 on 14/12/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class CountryApi {

    @JsonProperty("countryName")
    private String countryName;
    @JsonProperty("countryCode")
    private String countryCode;
    @JsonProperty("north")
    private Double north;
    @JsonProperty("south")
    private Double south;
    @JsonProperty("east")
    private Double east;
    @JsonProperty("west")
    private Double west;

    public CountryApi() {
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Double getNorth() {
        return north;
    }

    public void setNorth(Double north) {
        this.north = north;
    }

    public Double getSouth() {
        return south;
    }

    public void setSouth(Double south) {
        this.south = south;
    }

    public Double getEast() {
        return east;
    }

    public void setEast(Double east) {
        this.east = east;
    }

    public Double getWest() {
        return west;
    }

    public void setWest(Double west) {
        this.west = west;
    }
}
