package iterremoto.beyondpc35.beyond.es.rlima.myapplication.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import iterremoto.beyondpc35.beyond.es.rlima.myapplication.R;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.model.Country;

/**
 * Created by BEYONDPC35 on 02/12/2015.
 */
public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private List<Country> listCountries;
    private Context context;

    public CountryAdapter(List<Country> listCountries, Context context) {
        this.listCountries = listCountries;
        this.context = context;
    }

    @Override
    public CountryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.pais_elemento, parent, false);

        return new CountryViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(CountryViewHolder holder, int position) {
        Country country = listCountries.get(position);

        holder.setCountryName(country.getCountryName());
        holder.setFlag(country.getFlag(), this.context);
        holder.setOnClickListener(country, context);
    }

    @Override
    public int getItemCount() {
        return listCountries.size();
    }


}