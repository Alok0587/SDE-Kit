package design.patterns.Structural.Decorator;

public class Client {

    public static void main(String[] args) {
        Coffee coffee=new SimpleCoffee();
        MilkDecorator milkDecorator=new CoffeeDecorator(coffee);
        System.out.println(milkDecorator.getDescription()+" ->"+milkDecorator.getPrice());
    }
}
