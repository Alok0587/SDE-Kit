package design.patterns.creational.singleton;

public class ThreadSafeOrder {
    private static ThreadSafeOrder order;

    int orderId;
    int quantity;
    int price;

    private ThreadSafeOrder() {
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


    /*
     Add "synchronized" for the thread Safety
     */
    public static synchronized ThreadSafeOrder getInstance() {
        if(order==null){
            order=new ThreadSafeOrder();
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
