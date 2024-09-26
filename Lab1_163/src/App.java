import java.sql.Driver;

public class App {
    public static void main(String[] args) {
        PaymentMethod riderPayment = new CreditCard();
        Rider rider = new Rider("R1", "Faiza Maliat", riderPayment);
        Driver driver = new Driver("D1", "Fairooz Maisha", "Sedan");

        Admin admin = new Admin();
        admin.manageDriver(driver);
        admin.manageRider(rider);

        // No need to specify RideType explicitly, as Trip handles it internally now
        rider.requestRide(driver, "Mirpur", "DMD", 10.5);
        
        rider.rateDriver(driver, 4.8);
    }
}

