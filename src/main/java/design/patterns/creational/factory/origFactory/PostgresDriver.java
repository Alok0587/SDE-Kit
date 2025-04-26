package design.patterns.creational.factory.origFactory;

public class PostgresDriver extends DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new PostgresDB() ;
    }
}
