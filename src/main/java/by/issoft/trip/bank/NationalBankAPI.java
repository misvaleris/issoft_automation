package by.issoft.trip.bank;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class NationalBankAPI {
    public ExchangeRate[] getCurrenciesExchangeRate()  {
        try {
            // Create a neat value object to hold the URL
            URL url = new URL("http://www.nbrb.by/api/exrates/rates?periodicity=0");

            // Open a connection(?) on the URL(??) and cast the response(???)
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Now it's "open", we can set the request method, headers etc.
            connection.setRequestProperty("accept", "application/json");

            // This line makes the request
            InputStream responseStream = connection.getInputStream();

            // Manually converting the response body InputStream to ExchangeRate using Jackson
            ObjectMapper mapper = new ObjectMapper();
            ExchangeRate[] exchangeRates = mapper.readValue(responseStream, ExchangeRate[].class);
           return exchangeRates;
        } catch (IOException e) {
           return handleError(e);
        }
    }

    private ExchangeRate[] handleError(Exception e){
        System.out.println(e.getMessage());
        e.printStackTrace();
        return new ExchangeRate[0];
    }
}
