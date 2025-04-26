package design.patterns.creational.builder.classic;
import java.math.BigDecimal;
import java.util.Date;

public interface OrderBuilder {
    void buildId(int id);
    void buildCustomerId(int customerId);
    void buildSku(int sku);
    void buildPrice(BigDecimal price);
    void buildItemName(String itemName);
    void buildOrderDate(Date orderDate);
    void buildQuantity(int quantity);
    Order build();
}
