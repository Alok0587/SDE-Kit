package design.patterns.solid.LiskovSubsPrinciple.BadExample;

/*
"Objects of a superclass should be replaceable with objects of a subclass without breaking the correctness of the program."
— Barbara Liskov
 */
class Sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow fly");
    }
}
class Ostrich implements Bird {
    public void fly() {

        /*
        Ostrich can't fly, So Here subclass is not irreplacable with super class
         */
        throw new UnsupportedOperationException();
    }
}
public class BadExample {

    public static void main(String[] args) {
        Bird bird=new Ostrich();
        bird.fly();
    }

}
