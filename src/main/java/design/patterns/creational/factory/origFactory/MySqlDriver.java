package design.patterns.creational.factory.origFactory;

public class MySqlDriver extends DatabaseFactory {

    @Override
    public Database getDatabase() {
        return new MySqlDB() ;
    }
}
