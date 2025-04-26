package design.patterns.Behavioural.Strategy;

public class BankTransfer implements Payment {
    @Override
    public void pay() {
        System.out.println("Paid using bank transfer");
    }
}
