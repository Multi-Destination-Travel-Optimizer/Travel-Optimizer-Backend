package optimizer;

import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, UnirestException {
        TravelAlgorithm travelAlgorithm = new TravelAlgorithm();
        // Test of destinations.
        ArrayList<String> destinationsTest = new ArrayList<>();
        destinationsTest.add("JFK");
        destinationsTest.add("SFO");

        travelAlgorithm.findOptimumTickets(destinationsTest, "","");
    }
}
