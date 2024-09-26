import java.sql.Driver;

class Rider {
    private String id;
    private String name;
    private double rating;
    private PaymentMethod preferredPaymentMethod;

    public Rider(String id, String name, PaymentMethod paymentMethod) {
        this.id = id;
        this.name = name;
        this.preferredPaymentMethod = paymentMethod;
        this.rating = 5.0;
    }

    public void requestRide(Driver driver, String pickup, String dropOff, double distance) {
        Trip trip = new Trip(this, driver, pickup, dropOff, distance);
        trip.startTrip();
        trip.completeTrip();
    }

    public void rateDriver(Driver driver, double rating) {
        System.out.println(name + " rated driver " + driver.getName() + " with " + rating + " stars.");
        driver.updateRating(rating);
    }

    public String getName() {
        return name;
    }
}

