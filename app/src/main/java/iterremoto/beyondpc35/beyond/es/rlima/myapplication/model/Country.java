package iterremoto.beyondpc35.beyond.es.rlima.myapplication.model;

/**
 * Created by BEYONDPC35 on 02/12/2015.
 */
public class Country {

    private String countryName;
    private String countryCode;
    private Double north;
    private Double south;
    private Double east;
    private Double west;
    private String flag;

    public Country() {
    }

    public Country(String countryName, String countryCode, Double west, Double east, Double south, Double north) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.west = west;
        this.east = east;
        this.south = south;
        this.north = north;
        this.flag = "http://www.geonames.org/flags/x/" + countryCode.toLowerCase() + ".gif";;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Double getWest() {
        return west;
    }

    public void setWest(Double west) {
        this.west = west;
    }

    public Double getEast() {
        return east;
    }

    public void setEast(Double east) {
        this.east = east;
    }

    public Double getSouth() {
        return south;
    }

    public void setSouth(Double south) {
        this.south = south;
    }

    public Double getNorth() {
        return north;
    }

    public void setNorth(Double north) {
        this.north = north;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }
}
