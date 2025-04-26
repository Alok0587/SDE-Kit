package design.patterns.solid.interfaceSeggPrinciple;

public class GoodExample implements Print {

    @Override
    public void print() {
        System.out.println("Printed GoodExample");
    }

    /*
    Here we don't have to implement irrelevant methods
     */
}
