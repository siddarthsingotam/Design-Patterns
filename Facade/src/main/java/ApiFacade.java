import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiFacade {
    public String getAttributeValueFromJson(String urlString, String attributeName) throws IllegalArgumentException, IOException {
        try {
            String jsonResult = getJsonFromApi(urlString);
            return extractAttributeFromJson(jsonResult, attributeName);
        } catch (IOException e) {
            throw e; // Re-throw IOException for handling in the client code
        } catch (Exception e) {
            throw new IllegalArgumentException("Attribute not found or invalid JSON format");
        }
    }

    private String getJsonFromApi(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
            StringBuilder content = new StringBuilder();
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            return content.toString();
        } finally {
            con.disconnect();
        }
    }

    private String extractAttributeFromJson(String json, String attributeName) throws Exception {
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = (JSONObject) parser.parse(json);
        if (jsonObject.containsKey(attributeName)) {
            return String.valueOf(jsonObject.get(attributeName));
        } else {
            throw new IllegalArgumentException("Attribute not found");
        }
    }

    public static void main(String[] args) {
        ApiFacade facade = new ApiFacade();

        // Example usage with Chuck Norris API
        try {
            String jokeUrl = "https://api.chucknorris.io/jokes/random";
            String jokeText = facade.getAttributeValueFromJson(jokeUrl, "value");
            System.out.println("Chuck Norris Joke: " + jokeText);
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }

        // Example usage with another API (Foreign Exchange Rates)
        try {
            String fxRatesUrl = "https://api.fxratesapi.com/latest";
            String baseCurrency = "USD";
            String fxRates = facade.getAttributeValueFromJson(fxRatesUrl, "rates");
            String fxRateForBaseCurrency = facade.getAttributeValueFromJson(fxRates, baseCurrency);
            System.out.println("Exchange Rate for " + baseCurrency + ": " + fxRateForBaseCurrency);
        } catch (IOException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}

