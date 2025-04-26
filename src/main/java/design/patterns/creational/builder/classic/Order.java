package design.patterns.creational.builder.classic;

import java.math.BigDecimal;
import java.util.Date;

//This is the complex object for which we want to simplify object creation
public class Order {
    private int id;
    private String itemName;
    private int quantity;
    private Date orderDate;
    private BigDecimal price;
    private int customerId;
    private int sku;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", itemName='" + itemName + '\'' +
                ", quantity=" + quantity +
                ", orderDate=" + orderDate +
                ", price=" + price +
                ", customerId=" + customerId +
                ", sku=" + sku +
                '}';
    }
}
