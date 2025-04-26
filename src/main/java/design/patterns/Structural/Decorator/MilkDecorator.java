package design.patterns.Structural.Decorator;

public abstract class MilkDecorator implements Coffee {
    private final Coffee decoratedCoffee;
    public MilkDecorator(Coffee coffee) {
        this.decoratedCoffee = coffee;
    }

    @Override
    public String getDescription(){
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getPrice() {
        return 0.5;
    }
}
