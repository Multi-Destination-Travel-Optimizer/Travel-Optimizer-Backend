package optimizer;

/**
 * Contains information about a plane ticket.
 */
public class AirTicket {
    /**
     * Cost of ticked in USD.
     */
    private double price;
    /**
     * The airline company this ticket pertains to.
     */
    private String airline;
    /**
     * The Carrier ID is linked to the airline.
     */
    private int carrierID;
    /**
     * The date and time of the ticket in the format YYYY-MM-DDT00:00:00 (e.g. 2018-03-02T03:23:00)
     */
    private String dateAndTime;
    /**
     * The International Air Transport Association (IATA) code of the starting airport.
     */
    private String startIATACode;
    /**
     * The International Air Transport Association (IATA) code of the destination airport.
     */
    private String endIATACode;

    public AirTicket(double price, String airline, int carrierID, String dateAndTime, String startIATACode, String endIATACode) {
        this.price = price;
        this.airline = airline;
        this.carrierID = carrierID;
        this.dateAndTime = dateAndTime;
        this.startIATACode = startIATACode;
        this.endIATACode = endIATACode;
    }

    public double getPrice() {
        return price;
    }

    public String getAirline() {
        return airline;
    }

    public int getCarrierID() {
        return carrierID;
    }

    public String getDateAndTime() {
        return dateAndTime;
    }

    public String getStartIATACode() {
        return startIATACode;
    }

    public String getEndIATACode() {
        return endIATACode;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setCarrierID(int carrierID) {
        this.carrierID = carrierID;
    }

    public void setDateAndTime(String dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public void setStartIATACode(String startIATACode) {
        this.startIATACode = startIATACode;
    }

    public void setEndIATACode(String endIATACode) {
        this.endIATACode = endIATACode;
    }
}
