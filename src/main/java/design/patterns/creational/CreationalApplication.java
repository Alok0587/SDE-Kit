package design.patterns.creational;

import design.patterns.creational.builder.classic.ConcreteOrderBuilder;
import design.patterns.creational.builder.classic.Order;
import design.patterns.creational.builder.classic.OrderBuilderDirector;
import org.springframework.boot.SpringApplication;

//@SpringBootApplication
public class CreationalApplication {

    public static void main(String[] args) {

        SpringApplication.run(CreationalApplication.class, args);

        //with classic implementation of a builder pattern
        ConcreteOrderBuilder concreteOrderBuilder = new ConcreteOrderBuilder();

        OrderBuilderDirector director = new OrderBuilderDirector(concreteOrderBuilder);
        Order order = director.construct();
        System.out.println("Display Order->"+order);

        //method-2
       //with inner class builder
        design.patterns.creational.builder.Short.Order order2= new design.patterns.creational.builder.Short.Order.OrderBuilder(1234,"12dfrd")
                .withPrice(10)
                .withQuantity(10)
                .getOrder().build();

        System.out.println("Display Order2->"+order2);

    }

}
