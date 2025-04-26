package design.patterns.Structural.Decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public double getPrice() {
        return 5.0;
    }

    @Override
    public String getDescription() {
        return "Simple Coffee";
    }
}
