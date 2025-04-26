package design.patterns.creational.builder.classic;
import java.math.BigDecimal;
import java.util.Date;

public class ConcreteOrderBuilder implements OrderBuilder {

    private final Order order;

    public ConcreteOrderBuilder() {
        this.order = new Order();
    }

    @Override
    public void buildId(int id) {
        order.setId(id);
    }

    @Override
    public void buildCustomerId(int customerId) {
        order.setCustomerId(customerId);
    }

    @Override
    public void buildSku(int sku) {
        order.setSku(sku);
    }

    @Override
    public void buildPrice(BigDecimal price) {
        order.setPrice(price);
    }

    @Override
    public void buildItemName(String itemName) {
        order.setItemName(itemName);
    }

    @Override
    public void buildOrderDate(Date orderDate) {
        order.setOrderDate(orderDate);
    }

    @Override
    public void buildQuantity(int quantity) {
        order.setQuantity(quantity);
    }

    @Override
    public Order build() {
        return order;
    }
}
