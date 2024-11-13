import java.util.ArrayList;
import java.util.List;

class NotificationFacade {
    private List<INotification> notifications;

    public NotificationFacade() {
        notifications = new ArrayList<>();
    }

    public void addNotification(INotification notification) {
        notifications.add(notification);
    }

    public void displayNotifications() {
        System.out.println("\nNotifications:");
        int index = 1;
        for (INotification notification : notifications) {
            System.out.println(index++ + ". " + notification.getDetails());
        }
    }

    public void markNotificationAsRead(int index) {
        try {
            notifications.get(index).markAsRead();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid notification index.");
        }
    }


    public void markNotificationAsUnread(int index) {
        try {
            notifications.get(index).markAsUnread();
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid notification index.");
        }
    }

    public void deleteNotification(int index) {
        try {
            notifications.get(index).delete();
            notifications.remove(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid notification index.");
        }
    }
}