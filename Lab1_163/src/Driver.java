class Driver {
    private String id;
    private String name;
    private double rating;
    private String vehicleType;
    private boolean available;

    public Driver(String id, String name, String vehicleType) {
        this.id = id;
        this.name = name;
        this.vehicleType = vehicleType;
        this.rating = 5.0;
        this.available = true;
    }

    public void acceptRide(Rider rider) {
        System.out.println("Driver " + name + " accepted the ride from " + rider.getName());
        this.available = false;
    }

    public void updateLocation(String location) {
        System.out.println(name + " updated location to: " + location);
    }

    public void updateRating(double rating) {
        this.rating = (this.rating + rating) / 2;
        System.out.println(name + " new rating is: " + this.rating);
    }

    public String getName() {
        return name;
    }

    public boolean isAvailable() {
        return available;
    }

    public void completeTrip() {
        System.out.println(name + " has completed the trip.");
        this.available = true;
    }
}