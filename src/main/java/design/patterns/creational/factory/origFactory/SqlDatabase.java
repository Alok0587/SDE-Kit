package design.patterns.creational.factory.origFactory;

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
