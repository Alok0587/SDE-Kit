package oops;

public class Polymorphism {
    /**
     * Polymorphism in Java is the ability of an object to take on many forms.
     * The most common use of polymorphism in OOP is when a parent class reference is used to refer to a child class object.
     * There are two types of polymorphism in Java:
     * 1. Compile-time polymorphism (Method Overloading)
     * 2. Runtime polymorphism (Method Overriding)
     * Polymorphism allows methods to do different things based on the object that it is acting upon, even though they share the same name.
     * Example:
     */
}
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}
class MathOperation {
    // Method Overloading (Compile-time polymorphism)
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
}
class TestPolymorphism {
    public static void main(String[] args) {

        //Runtime polymorphism example
        Animal myAnimal;
        myAnimal = new Dog();
        myAnimal.sound(); // Outputs: Dog barks

        Animal myAnimal2 = new Cat();
        myAnimal2.sound(); // Outputs: Cat meows

        //compile-time polymorphism example
        MathOperation math = new MathOperation();
        System.out.println(math.add(5, 10)); // Outputs: 15
        System.out.println(math.add(5.5, 10.5)); // Outputs: 16.0
    }

}

