interface RideType {
    public abstract double calculateFare(double distance);
}

// Concrete ride strategies
class Carpool implements  RideType {
    public double calculateFare(double distance) {
        return distance * 0.5;
    }
}

class Luxury implements RideType {
    public double calculateFare(double distance) {
        return distance * 2.0;
    }
}

class Bike implements RideType {
    public double calculateFare(double distance) {
        return distance * 0.3;
    }

}