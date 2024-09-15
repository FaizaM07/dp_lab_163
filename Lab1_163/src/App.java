public class App {
    public static void main(String[] args) {
       
        PaymentMethod riderPayment = new CreditCard();
        
       
        NotificationService smsNotification = new SMSNotification();
        
        // Create users
        Rider rider = new Rider("R1", "Faiza Maliat", riderPayment);
        Driver driver = new Driver("D1", "Fairooz Maisha", "Sedan");
        
        // Admin panel
        Admin admin = new Admin();
        admin.manageDriver(driver);
        admin.manageRider(rider);
        
        // Request 
        RideType luxuryRide = new Luxury();
        rider.requestRide(driver, luxuryRide, "Mirpur", "DMD", 10.5, "Morning");
        
        // trip er poreee
        rider.rateDriver(driver, 4.8);
    }
}
