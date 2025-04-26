package design.patterns.solid.OpenClosedPrinciple;


/*
Now we can extend and add functionality for different types of sender.
 */
public class GoodExample{
    NotificationSender notificationSender=new EmailSender();

    public void sendNotificationSender(String message) {
        notificationSender.sendNotification(message);
    }
}
