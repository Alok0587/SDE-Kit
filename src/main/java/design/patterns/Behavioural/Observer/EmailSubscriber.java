package design.patterns.Behavioural.Observer;

public class EmailSubscriber implements Observer {

    @Override
    public void update(String message) {
        System.out.println("Through email:"+message);
    }
}
