package design.patterns.solid.OpenClosedPrinciple;

/*
This is a bad example as inorder to add a new Notification type; we have to modify existing class.
 */
class Notification{
    public void notify(String message) {
        if(message.equals("Email")){
            System.out.println("Send Email notification");
        }else if(message.equals("Phone")){
            System.out.println("Send Phone notification");
        }else if(message.equals("SMS")){
            System.out.println("Send SMS notification");
        }
    }
}
public class BadExample {

}
