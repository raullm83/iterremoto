package iterremoto.beyondpc35.beyond.es.rlima.myapplication.comparator;

import java.util.Comparator;

import iterremoto.beyondpc35.beyond.es.rlima.myapplication.model.Country;

/**
 * Created by BEYONDPC35 on 14/12/2015.
 */
public class CountryComparator implements Comparator<Country> {
    @Override
    public int compare(Country lhs, Country rhs) {
        return lhs.getCountryName().compareTo(rhs.getCountryName());
    }
}
