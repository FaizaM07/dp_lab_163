public class Main {
    public static void main(String[] args) {
        NotificationFacade facade = new NotificationFacade();

        
        TwitterNotification twitterNotification1 = new TwitterNotification("New follower: Faiza Maliat");
        FacebookNotification facebookNotification1 = new FacebookNotification("You have a new friend request.");

      
        facade.addNotification(new TwitterNotificationAdapter(twitterNotification1));
        facade.addNotification(new FacebookNotificationAdapter(facebookNotification1));

      
        facade.displayNotifications();

       
        facade.markNotificationAsRead(0); 
        facade.deleteNotification(1);    

       
        facade.displayNotifications();
    }
}