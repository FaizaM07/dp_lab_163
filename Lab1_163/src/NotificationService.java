abstract class NotificationService {
    public abstract void sendNotification(String message);
}

// Concrete notification strategies
class SMSNotification extends NotificationService {
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}

class EmailNotification extends NotificationService {
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}

class InAppNotification extends NotificationService {
    public void sendNotification(String message) {
        System.out.println("In-App: " + message);
    }
}