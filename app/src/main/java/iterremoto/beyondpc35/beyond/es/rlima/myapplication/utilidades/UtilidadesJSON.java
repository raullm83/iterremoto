package iterremoto.beyondpc35.beyond.es.rlima.myapplication.utilidades;

import android.support.annotation.Nullable;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by BEYONDPC35 on 14/12/2015.
 */
public class UtilidadesJSON {
    public static String getJSON(String sUrl) throws IOException {
        URL url = new URL(sUrl);

        HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        urlConnection.setRequestMethod("GET");
        urlConnection.connect();
        InputStream input = urlConnection.getInputStream();
        List<String> lineas = IOUtils.readLines(input, null);
        return StringUtils.join(lineas);
    }
}
