interface INotification {
    void markAsRead();
    void markAsUnread();
    void delete();
    String getDetails();
}