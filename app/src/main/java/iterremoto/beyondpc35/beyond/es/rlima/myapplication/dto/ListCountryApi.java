package iterremoto.beyondpc35.beyond.es.rlima.myapplication.dto;

import java.util.List;

/**
 * Created by BEYONDPC35 on 14/12/2015.
 */
public class ListCountryApi {

    private List<CountryApi> geonames;

    public ListCountryApi() {
    }

    public List<CountryApi> getGeonames() {
        return geonames;
    }

    public void setGeonames(List<CountryApi> geonames) {
        this.geonames = geonames;
    }
}
