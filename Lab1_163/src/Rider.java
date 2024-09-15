class Rider {
    private String id;
    private String name;
    private double rating;
    private PaymentMethod preferredPaymentMethod;

    public Rider(String id, String name, PaymentMethod paymentMethod) {
        this.id = id;
        this.name = name;
        this.preferredPaymentMethod = paymentMethod;
        this.rating = 5.0; // set korlam just emniiiiiiii
    }

    public void requestRide(Driver driver, RideType rideType, String pickup, String dropOff, double distance, String timeOfDay) {
        Trip trip = new Trip(this, driver, rideType, pickup, dropOff, distance, timeOfDay);
        trip.startTrip();
        trip.completeTrip();
    }

    public void rateDriver(Driver driver, double rating) {
        System.out.println(name + " rated driver " + driver.getName() + " with " + rating + " stars.");
        driver.updateRating(rating);
    }

    public void makePayment(double amount) {
        preferredPaymentMethod.processPayment(amount);
    }

    public String getName() {
        return name;
    }
}
