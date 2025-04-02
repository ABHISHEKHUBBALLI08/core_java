public class Airport {
    String airportName;
    String airportCode;
    String location;
    int numberOfRunways;
    int capacity;
    boolean isInternational;
    int numberOfTerminals;
    String timeZone;
    String contactNumber;
    String operatingHours;
    public Airport() {
        System.out.println("default constructor for airport");
    }
    public Airport(String airportName, String airportCode, String location, int numberOfRunways, int capacity) {
        this();
        this.airportName = airportName;
        this.airportCode = airportCode;
        this.location = location;
        this.numberOfRunways = numberOfRunways;
        this.capacity = capacity;
        System.out.println("Constructor 2: Calls Constructor 1");
    }
    public Airport(String airportName, String airportCode, String location, int numberOfRunways, int capacity, boolean isInternational, int numberOfTerminals) {
        this(airportName, airportCode, location, numberOfRunways, capacity);
        this.isInternational = isInternational;
        this.numberOfTerminals = numberOfTerminals;
        System.out.println("Constructor 3: Calls Constructor 2");
    }

    public Airport(String airportName, String airportCode, String location, int numberOfRunways, int capacity, boolean isInternational, int numberOfTerminals, String timeZone, String contactNumber) {
        this(airportName, airportCode, location, numberOfRunways, capacity, isInternational, numberOfTerminals);
        this.timeZone = timeZone;
        this.contactNumber = contactNumber;
        System.out.println("Constructor 4: Calls Constructor 3");
    }

    public Airport(String airportName, String airportCode, String location, int numberOfRunways, int capacity, boolean isInternational, int numberOfTerminals, String timeZone, String contactNumber, String operatingHours) {
        this(airportName, airportCode, location, numberOfRunways, capacity, isInternational, numberOfTerminals,timeZone,contactNumber);
        this.operatingHours = operatingHours;
        System.out.println("Constructor 5: Calls Constructor 4");
    }

    public static void main(String[] args) {
        Airport airport = new Airport("Indira Gandhi International Airport", "DEL",
                "New Delhi", 3, 70000000, true, 3,
                "IST", "+91 124 337 6000", "24/7");

    }
}
