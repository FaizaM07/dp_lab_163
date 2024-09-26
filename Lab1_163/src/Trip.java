import java.sql.Driver;

class Trip implements RideType, PaymentMethod {
    private Rider rider;
    private Driver driver;
    private String pickupLocation;
    private String dropOffLocation;
    private double distance;
    private double fare;
    private NotificationService notificationService;

    public Trip(Rider rider, Driver driver, String pickupLocation, String dropOffLocation, double distance) {
        this.rider = rider;
        this.driver = driver;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.distance = distance;
        this.fare = calculateFare(distance); // Using RideType's fare calculation
        this.notificationService = new SMSNotification(); // Default notification
    }

    @Override
    public double calculateFare(double distance) {
        return distance * 1.5; // Default fare calculation logic, can vary by RideType
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of BDT " + amount);
    }

    public void startTrip() {
        driver.acceptRide(rider);
        System.out.println("Trip started: Pickup at " + pickupLocation + ", Drop-off at " + dropOffLocation);
    }

    public void completeTrip() {
        System.out.println("Trip completed. Total fare: BDT " + fare);
        notificationService.sendNotification("Your trip is complete.");
        processPayment(fare); // Using PaymentMethod's processPayment
        driver.completeTrip();
    }
}
