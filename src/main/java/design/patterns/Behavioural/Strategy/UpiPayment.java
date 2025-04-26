package design.patterns.Behavioural.Strategy;

public class UpiPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("paid using UPI");
    }
}
