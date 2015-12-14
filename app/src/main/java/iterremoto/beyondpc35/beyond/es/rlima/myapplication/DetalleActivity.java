package iterremoto.beyondpc35.beyond.es.rlima.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.rest.CountryDownloader;

public class DetalleActivity extends AppCompatActivity {

    public static final String COUNTRY_NAME_KEY = "country_name";
    public static final String COUNTRY_NORTE_KEY = "country_norte";
    public static final String COUNTRY_SUR_KEY = "country_sur";
    public static final String COUNTRY_ESTE_KEY = "country_este";
    public static final String COUNTRY_OESTE_KEY = "country_oeste";

    @Bind(R.id.country_name_detalle)
    TextView countryName;
    @Bind(R.id.country_norte)
    TextView countryNorte;
    @Bind(R.id.country_sur)
    TextView countrySur;
    @Bind(R.id.country_este)
    TextView countryEste;
    @Bind(R.id.country_oeste)
    TextView countryOeste;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        ButterKnife.bind(this);

        countryName.setText(getIntent().getExtras().getString(COUNTRY_NAME_KEY));
        countryNorte.setText(Double.toString(getIntent().getExtras().getDouble(COUNTRY_NORTE_KEY)));
        countrySur.setText(Double.toString(getIntent().getExtras().getDouble(COUNTRY_SUR_KEY)));
        countryEste.setText(Double.toString(getIntent().getExtras().getDouble(COUNTRY_ESTE_KEY)));
        countryOeste.setText(Double.toString(getIntent().getExtras().getDouble(COUNTRY_OESTE_KEY)));

        this.setTitle(countryName.getText());
    }
}
