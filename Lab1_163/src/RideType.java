interface RideType {
    double calculateFare(double distance, String timeOfDay);
}

class Carpool implements RideType {
    public double calculateFare(double distance, String timeOfDay) {
        // for carpool
        return distance * 0.5;
    }
}

class Luxury implements RideType {
    public double calculateFare(double distance, String timeOfDay) {
        // luxury rides er jonno higher
        return distance * 2.0;
    }
}

class Bike implements RideType {
    public double calculateFare(double distance, String timeOfDay) {
        // a bit lower
        return distance * 0.3;
    }
}
