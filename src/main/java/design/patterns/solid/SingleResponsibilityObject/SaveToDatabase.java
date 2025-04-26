package design.patterns.solid.SingleResponsibilityObject;

public class SaveToDatabase implements DB {

    @Override
    public void getName() {
        System.out.println("DB Name");
    }
    public void save(){
        System.out.println("DB Save");
    }
}
