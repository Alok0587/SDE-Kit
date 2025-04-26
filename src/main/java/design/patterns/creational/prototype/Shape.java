package design.patterns.creational.prototype;

public interface Shape extends Cloneable {
    void draw();
    Shape clone();
}
