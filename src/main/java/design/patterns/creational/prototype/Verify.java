package design.patterns.creational.prototype;

public class Verify {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(12);

        Shape circleClone = circle.clone();
        Shape rectangleClone = rectangle.clone();

        circleClone.draw();
        rectangleClone.draw();

        System.out.println(circleClone+"->"+circle);
        System.out.println(rectangleClone+"->"+rectangle);

    }
}
