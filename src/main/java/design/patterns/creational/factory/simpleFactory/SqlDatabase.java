package design.patterns.creational.factory.simpleFactory;

public class SqlDatabase implements Database {
    @Override
    public String getName() {
        return "SQL Server";
    }

    @Override
    public boolean isActive() {
        return true;
    }
}
