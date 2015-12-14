package iterremoto.beyondpc35.beyond.es.rlima.myapplication.converter;

import java.util.ArrayList;
import java.util.List;

import iterremoto.beyondpc35.beyond.es.rlima.myapplication.dto.CountryApi;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.model.Country;

/**
 * Created by BEYONDPC35 on 14/12/2015.
 */
public class CountryConverter {
    public static List<Country> convert(List<CountryApi> elements) {
        List<Country> l = new ArrayList<>();
        for (CountryApi element : elements) {
            l.add(convert(element));
        }
        return l;
    }

    public static Country convert(CountryApi element) {
        return new Country(element.getCountryName(), element.getCountryCode(), element.getWest(), element.getEast(), element.getSouth(), element.getNorth());
    }
}
