package design.patterns.creational.singleton;

public class Order {

    private static Order order;

    int orderId;
    int quantity;
    int price;

    private Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public static Order getInstance() {
        if(order==null){
            order=new Order();
        }
        return order;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
