package design.patterns.creational.factory.origFactory;

public abstract class DatabaseFactory {
    public void verify(Database database) {
           System.out.println(database.getName());
    }
    public abstract Database getDatabase();
}
