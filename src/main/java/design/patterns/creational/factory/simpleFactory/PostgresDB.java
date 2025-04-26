package design.patterns.creational.factory.simpleFactory;

public class PostgresDB implements Database {

    @Override
    public String getName() {
        return "Postgres DB Server";
    }

    @Override
    public boolean isActive() {
        return false;
    }
}
