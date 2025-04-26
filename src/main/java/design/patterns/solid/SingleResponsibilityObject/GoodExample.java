package design.patterns.solid.SingleResponsibilityObject;

/*
This is good example because now we have seperated each responsibility
 */

public class GoodExample {

    public static void main(String[] args) {
        CreateConnection createConnection = new CreateConnection();
        createConnection.connect();

        LoadDB loadDatabase = new LoadDB();
        loadDatabase.loadData();
    }
}
