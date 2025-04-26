package design.patterns.creational.singleton;

public class Test {

    public static void main(String[] args) {

        Order order= Order.getInstance();
        order.setOrderId(1234);
        System.out.println(order);

    }
}
