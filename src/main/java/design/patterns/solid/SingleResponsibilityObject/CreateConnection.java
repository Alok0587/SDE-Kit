package design.patterns.solid.SingleResponsibilityObject;

public class CreateConnection implements DB {

    @Override
    public void getName() {
    }

    public void connect(){
        System.out.println("Connected to DB");
    }
}
