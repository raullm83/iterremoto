package iterremoto.beyondpc35.beyond.es.rlima.myapplication.rest;

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Collections;
import java.util.List;

import iterremoto.beyondpc35.beyond.es.rlima.myapplication.adapter.CountryAdapter;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.comparator.CountryComparator;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.converter.CountryConverter;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.dto.ListCountryApi;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.model.Country;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.utilidades.UtilidadesJSON;

/**
 * Created by BEYONDPC35 on 14/12/2015.
 */
public class CountryDownloader extends AsyncTask<Void, Void, ListCountryApi> {

    private String url;
    private RecyclerView recyclerView;

    public CountryDownloader(String url, RecyclerView recyclerView) {
        this.url = url;
        this.recyclerView = recyclerView;
    }

    @Override
    protected ListCountryApi doInBackground(Void... params) {
        ListCountryApi resultado = null;
        try {
            String result = UtilidadesJSON.getJSON(this.url);
            ObjectMapper mapper = new ObjectMapper();
            List<ListCountryApi> l = mapper.readValue(result, TypeFactory.defaultInstance().constructCollectionType(List.class,
                    ListCountryApi.class));

            resultado = l.get(0);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            Log.e("ERROR MALFORMEDURL", "Se ha producido un error al obtener los datos de la api");
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            Log.e("ERROR IOException", "Se ha producido un error al obtener los datos de la api");
            return null;
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            Log.e("ERROR IndexOutOfBounds", "Se ha producido un error al obtener los datos de la api");
            return null;
        }
        return resultado;
    }

    @Override
    protected void onPostExecute(ListCountryApi listCountryApi) {
        super.onPostExecute(listCountryApi);

        List<Country> lCountry = CountryConverter.convert(listCountryApi.getGeonames());
        Collections.sort(lCountry, new CountryComparator());

        CountryAdapter adapter = new CountryAdapter(lCountry, recyclerView.getContext());
        recyclerView.setAdapter(adapter);
    }
}
