package oops;

public class Inheritance {
    /*
    Inheritance is a fundamental concept in object-oriented programming (OOP) that allows a new class (called a subclass or derived class) to inherit properties and behaviors (fields and methods) from an existing class (called a superclass or base class).
     This promotes code reusability and establishes a hierarchical relationship between classes.
     In java, inheritance is implemented using the "extends" keyword.
     */
    // Example of Inheritance

    public static void main(String[] args) {
        ostrich obj = new ostrich();
        obj.eat(); // Inherited method from Bird class
        obj.walk(); // Method from ostrich class
    }

}
class Bird {
    void eat() {
        System.out.println("This Bird eats food.");
    }
}
class ostrich extends Bird {
    void walk() {
        System.out.println("ostrich walks on two legs.");
    }
}

