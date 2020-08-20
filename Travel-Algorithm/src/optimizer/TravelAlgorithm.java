package optimizer;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

/**
 * Handles searching for the optimum sequence of tickets based on air fare.
 */
public class TravelAlgorithm {
    /**
     * All the responses from API calls to Skycanner Flight Search.
     */
    private ArrayList<HttpResponse<String>> responses;
    /**
     *
     */
    private String skyscannerAPIKey;

    //String SYSCANNER_API_KEY = process.env.SKYSCANNER_API_KEY;

    /**
     * Finds the optimum airplane tickets from the user's choice of the sequence of destination by comparing ticket
     * prices.
     * @param destinations where the user would like to go in sequential order. Destinations are represented in the
     *                     International International Air Transport Association (IATA) code for the airport.
     * @param tripStartDate start date in the format YYYY-MM-DD of the whole travel.
     * @param tripEndDate end date in the format YYYY-MM-DD of the whole travel.
     * @return ArrayList of the cheapest AirTickets within the user's journey duration.
     */
    public ArrayList<AirTicket> findOptimumTickets(ArrayList<String> destinations,
                                                   String tripStartDate,
                                                   String tripEndDate) throws IOException, UnirestException {
        Map<String, String> env = System.getenv();
        skyscannerAPIKey = env.get("SKYSCANNER_API_KEY");

        responses = new ArrayList<>();

        // There is one airplane flight for ever two destinations (e.g. 3 destinations, 2 flights).
        for (int i = 0; i < destinations.size() - 1; i++) {
            String startIATACode = destinations.get(i);
            String endIATACode = destinations.get(i + 1);

            HttpResponse<String> response = Unirest.get("https://skyscanner-skyscanner-flight-search-v1.p.rapidapi.com" +
                    "/apiservices/browsequotes/v1.0/US/USD/en-US/" +
                    startIATACode + "-sky/" + endIATACode + "-sky/2020-09-01?inboundpartialdate=2019-12-01")
                    .header("x-rapidapi-host", "skyscanner-skyscanner-flight-search-v1.p.rapidapi.com")
                    .header("x-rapidapi-key", skyscannerAPIKey)
                    .asString();
            responses.add(response);
        }

        return null;
    }
}
