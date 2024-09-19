package ClassAndObjects;

public class FlightDTO {
    private String flightNumber;
    private String airline;
    private String origin;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private double ticketPrice;

    private static int flightCount = 0;

    public FlightDTO(String flightNumber, String airline, String origin, String destination, String departureTime, String arrivalTime, double ticketPrice) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.ticketPrice = ticketPrice;
        flightCount++;
    }

    // Getter and setter methods for instance variables
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public static int getFlightCount() {
        return flightCount;
    }

    @Override
    public String toString() {
        return "FlightDTO [Flight Number=" + flightNumber + ", Airline=" + airline + ", Origin=" + origin +
                ", Destination=" + destination + ", Departure Time=" + departureTime + ", Arrival Time=" + arrivalTime +
                ", Ticket Price=" + ticketPrice + "]";
    }

    // Main method to demonstrate the usage of FlightDTO class
    public static void main(String[] args) {
        FlightDTO flight1 = new FlightDTO("AA123", "American Airlines", "New York", "Los Angeles", "2023-08-01 07:00", "2023-08-01 10:00", 300.00);
        FlightDTO flight2 = new FlightDTO("DL456", "Delta Airlines", "Atlanta", "Chicago", "2023-08-02 09:00", "2023-08-02 11:00", 200.00);

        System.out.println(flight1);
        System.out.println(flight2);


        System.out.println("Total number of flights created: " + FlightDTO.getFlightCount());
    }
}
