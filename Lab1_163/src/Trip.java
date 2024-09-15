class Trip {
    private Rider rider;
    private Driver driver;
    private RideType rideType;
    private String pickupLocation;
    private String dropOffLocation;
    private double distance;
    private String timeOfDay;
    private double fare;

    public Trip(Rider rider, Driver driver, RideType rideType, String pickupLocation, String dropOffLocation, double distance, String timeOfDay) {
        this.rider = rider;
        this.driver = driver;
        this.rideType = rideType;
        this.pickupLocation = pickupLocation;
        this.dropOffLocation = dropOffLocation;
        this.distance = distance;
        this.timeOfDay = timeOfDay;
        this.fare = rideType.calculateFare(distance, timeOfDay);
    }

    public void startTrip() {
        driver.acceptRide(rider);
        System.out.println("Trip started: Pickup at " + pickupLocation + ", Drop-off at " + dropOffLocation);
    }

    public void completeTrip() {
        System.out.println("Trip completed. Total fare: BDT " + fare);
        rider.makePayment(fare);
        driver.completeTrip();
    }
}
