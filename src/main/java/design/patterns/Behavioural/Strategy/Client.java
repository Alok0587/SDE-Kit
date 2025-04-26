package design.patterns.Behavioural.Strategy;

public class Client {
    public static void main(String[] args) {
        //performed shopping operations and choose bank transfer to pay the bill
        Payment payment=new BankTransfer();
        payment.pay();
    }
}
