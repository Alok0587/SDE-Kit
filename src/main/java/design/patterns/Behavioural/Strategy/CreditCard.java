package design.patterns.Behavioural.Strategy;

public class CreditCard implements Payment {

    @Override
    public void pay() {
        System.out.println("Paid suing credit card");
    }
}
