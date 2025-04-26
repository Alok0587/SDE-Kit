package design.patterns.creational.prototype;

public class Rectangle implements Shape {
    public int area;

    public Rectangle(int area) {
        this.area = area;
    }
    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.area);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + area +
                '}';
    }
}
