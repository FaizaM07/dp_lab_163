interface NotificationService {
    void sendNotification(String message);
}

class SMSNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}

class EmailNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}

class InAppNotification implements NotificationService {
    public void sendNotification(String message) {
        System.out.println("In-App: " + message);
    }
}
