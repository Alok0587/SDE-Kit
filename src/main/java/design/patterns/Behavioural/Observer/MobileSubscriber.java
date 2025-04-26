package design.patterns.Behavioural.Observer;

public class MobileSubscriber implements Observer {

    @Override
    public void update(String message) {
        System.out.println("News on Mobile:"+message);
    }

}
