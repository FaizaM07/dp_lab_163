class FacebookNotification {
    private String message;

    public FacebookNotification(String message) {
        this.message = message;
    }

    public void markAsSeen() {
        System.out.println("Facebook: Marked as seen - " + message);
    }

    public void unmarkAsSeen() {
        System.out.println("Facebook: Unmarked as seen - " + message);
    }

    public void deleteNotification() {
        System.out.println("Facebook: Deleted notification - " + message);
    }

    public String getMessage() {
        return message;
    }
}