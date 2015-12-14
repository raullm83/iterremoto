package iterremoto.beyondpc35.beyond.es.rlima.myapplication.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;

import butterknife.Bind;
import butterknife.ButterKnife;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.DetalleActivity;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.R;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.model.Country;

/**
 * Created by BEYONDPC35 on 02/12/2015.
 */
public class CountryViewHolder extends RecyclerView.ViewHolder {

    @Bind(R.id.country_name)
    TextView countryName;

    @Bind(R.id.flag)
    ImageView flag;

    public CountryViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setCountryName(String countryName) {
        this.countryName.setText(countryName);
    }

    public void setFlag(String flag, Context context) {
        Picasso.with(context).load(flag).resize(200,100).into(this.flag);
    }

    public void setOnClickListener(final Country country, final Context context){
        this.countryName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetalleActivity.class);

                intent.putExtra(DetalleActivity.COUNTRY_NAME_KEY, country.getCountryName());
                intent.putExtra(DetalleActivity.COUNTRY_NORTE_KEY, country.getNorth());
                intent.putExtra(DetalleActivity.COUNTRY_SUR_KEY, country.getSouth());
                intent.putExtra(DetalleActivity.COUNTRY_ESTE_KEY, country.getEast());
                intent.putExtra(DetalleActivity.COUNTRY_OESTE_KEY, country.getWest());

                context.startActivity(intent);
            }
        });
    }
}
