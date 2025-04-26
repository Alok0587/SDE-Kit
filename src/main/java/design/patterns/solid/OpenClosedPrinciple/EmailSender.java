package design.patterns.solid.OpenClosedPrinciple;

public class  EmailSender implements NotificationSender {
    @Override
    public void sendNotification(String notification){
        System.out.println(notification);
    }
}
