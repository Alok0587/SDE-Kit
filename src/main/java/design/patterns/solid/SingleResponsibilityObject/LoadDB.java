package design.patterns.solid.SingleResponsibilityObject;

public class LoadDB implements DB {

    @Override
    public void getName() {
        System.out.println("DB Name");
    }

    public void loadData() {
        System.out.println("Load DB");
    }
}
