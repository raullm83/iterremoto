package iterremoto.beyondpc35.beyond.es.rlima.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.adapter.CountryAdapter;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.model.Country;
import iterremoto.beyondpc35.beyond.es.rlima.myapplication.rest.CountryDownloader;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.my_recycler_view)
    RecyclerView recyclerView;

    CountryAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        adapter = new CountryAdapter(new LinkedList<Country>(), this.getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(linearLayoutManager);

        CountryDownloader countryDownloader = new CountryDownloader(
                "http://api.geonames.org/countryInfoJSON?username=rlimamiranda&lang=es", recyclerView);
        countryDownloader.execute();
    }
}
