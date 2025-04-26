package design.patterns.solid.interfaceSeggPrinciple;

/*
In this Bad Example client forcefully have to implement the method it doesn't even Use.
 */
public class BadExample implements BadInterface {
    @Override
    public void doOtherStuff() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scan(String fileName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void print(String fileName){
        System.out.println(fileName);
    }
}
