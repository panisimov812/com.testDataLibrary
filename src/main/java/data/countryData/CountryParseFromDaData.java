package data.countryData;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class CountryParseFromDaData {

    public static void parseCountryFromDaData() throws IOException {
        JsonFactory jsonFactory = new JsonFactory();
        JsonParser jsonParser = jsonFactory.createParser(new URL("https://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/country"));
        while (jsonParser.nextToken() != JsonToken.END_OBJECT) {
            //get the current token
            String fieldname = jsonParser.getCurrentName();
            if ("name".equals(fieldname)) {
                //move to next token
                jsonParser.nextToken();
                System.out.println(jsonParser.getText());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        parseCountryFromDaData();
    }
}
