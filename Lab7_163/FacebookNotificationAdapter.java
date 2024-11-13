class FacebookNotificationAdapter implements INotification {
    private FacebookNotification facebookNotification;

    public FacebookNotificationAdapter(FacebookNotification facebookNotification) {
        this.facebookNotification = facebookNotification;
    }

    @Override
    public void markAsRead() {
        facebookNotification.markAsSeen();
    }

    @Override
    public void markAsUnread() {
        facebookNotification.unmarkAsSeen();
    }

    @Override
    public void delete() {
        facebookNotification.deleteNotification();
    }

    @Override
    public String getDetails() {
        return facebookNotification.getMessage();
    }
}