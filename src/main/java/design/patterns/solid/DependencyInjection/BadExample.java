package design.patterns.solid.DependencyInjection;
/*
  Bad example for DI would be tight coupling of object by creating the object.
 */
class Engine{
    public void start() {
        System.out.println("Engine starts");
    }
}
public class BadExample {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.start();
    }

}
