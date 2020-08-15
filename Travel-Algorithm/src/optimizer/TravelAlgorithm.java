package optimizer;

import java.util.ArrayList;

/**
 * Handles searching for the optimum sequence of tickets based on air fare.
 */
public class TravelAlgorithm {
    /**
     * Finds the optimum airplane tickets from the user's choice of the sequence of destination by comparing ticket
     * prices.
     * @param destinations where the user would like to go in sequential order. Destinations are represented in the
     *                     International International Air Transport Association (IATA) code for the airport.
     * @param tripStartDate start date in the format YYYY-MM-DDT00:00:00 of the whole travel.
     * @param tripEndDate end date in the format YYYY-MM-DDT00:00:00 of the whole travel.
     * @return ArrayList of the cheapest AirTickets within the user's journey duration.
     */
    public ArrayList<AirTicket> findOptimumTickets(ArrayList<String> destinations,
                                                   String tripStartDate,
                                                   String tripEndDate) {
        return null;
    }
}
