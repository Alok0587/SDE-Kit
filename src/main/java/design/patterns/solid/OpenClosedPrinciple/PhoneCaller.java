package design.patterns.solid.OpenClosedPrinciple;

public class PhoneCaller implements NotificationSender {

    @Override
    public void sendNotification(String to){
        System.out.println(to);
    }
}
