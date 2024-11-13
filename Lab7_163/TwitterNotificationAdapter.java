class TwitterNotificationAdapter implements INotification {
    private TwitterNotification twitterNotification;

    public TwitterNotificationAdapter(TwitterNotification twitterNotification) {
        this.twitterNotification = twitterNotification;
    }

    @Override
    public void markAsRead() {
        twitterNotification.markRead();
    }

    @Override
    public void markAsUnread() {
        twitterNotification.markUnread();
    }

    @Override
    public void delete() {
        twitterNotification.remove();
    }

    @Override
    public String getDetails() {
        return twitterNotification.getContent();
    }
}