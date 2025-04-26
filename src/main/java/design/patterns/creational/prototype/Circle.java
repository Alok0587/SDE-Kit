package design.patterns.creational.prototype;

public class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    public Shape clone() {
        return new Circle(this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
