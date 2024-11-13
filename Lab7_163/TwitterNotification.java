class TwitterNotification {
    private String content;

    public TwitterNotification(String content) {
        this.content = content;
    }

    public void markRead() {
        System.out.println("Twitter: Marked as read - " + content);
    }

    public void markUnread() {
        System.out.println("Twitter: Marked as unread - " + content);
    }

    public void remove() {
        System.out.println("Twitter: Deleted notification - " + content);
    }

    public String getContent() {
        return content;
    }
}
