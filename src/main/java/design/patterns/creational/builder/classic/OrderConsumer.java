package design.patterns.creational.builder.classic;

public class OrderConsumer {
    private final OrderBuilderDirector orderBuilderDirector;
    public OrderConsumer(OrderBuilderDirector orderBuilderDirector) {
        this.orderBuilderDirector = orderBuilderDirector;
    }

    public Order getOrder(){
        return orderBuilderDirector.construct();
    }
}
