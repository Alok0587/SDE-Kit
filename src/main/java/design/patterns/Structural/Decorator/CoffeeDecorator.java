package design.patterns.Structural.Decorator;

public class CoffeeDecorator extends MilkDecorator {

    public CoffeeDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getPrice() {
        return super.getPrice()+2.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+", Coffee";
    }
}
