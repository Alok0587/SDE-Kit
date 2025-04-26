package design.patterns.creational.builder.Short;

public class Order {
    int orderId;
    String sku;
    int quantity;
    int price;

    //only adding required parameter
    public Order(OrderBuilder builder) {
        orderId= builder.orderId;
        sku = builder.sku;
        quantity = builder.quantity;
        price = builder.price;
    }

    public static class OrderBuilder {
        int orderId;
        String sku;
        int quantity;
        int price;

        public OrderBuilder(int orderId, String sku) {
            this.orderId=orderId;
            this.sku=sku;
        }
        public OrderBuilder withQuantity(int quantity) {
            this.quantity=quantity;
            return this;
        }
        public OrderBuilder withPrice(int price) {
            this.price=price;
            return this;
        }

        public Order getOrder() {
            return new Order(this);
        }
    }

    public Order build(){
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + this.orderId +
                ", sku='" + this.sku + '\'' +
                ", quantity=" + this.quantity +
                ", price=" + this.price +
                '}';
    }
}
