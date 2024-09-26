interface PaymentMethod {
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of BDT " + amount);
    }
}

class PayPal implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of BDT " + amount);
    }
}

class DigitalWallet implements PaymentMethod {
    public void processPayment(double amount) {
        System.out.println("Processing Digital Wallet payment of BDT " + amount);
    }
}