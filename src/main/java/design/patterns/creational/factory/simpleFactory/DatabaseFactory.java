package design.patterns.creational.factory.simpleFactory;

public class DatabaseFactory {
    public static Database getDatabase(String Name) {
        return switch (Name) {
            case "MySql" -> new MySqlDB();
            case "PostgreSQL" -> new PostgresDB();
            case "SqlServer" -> new SqlDatabase();
            default -> throw new IllegalArgumentException("Unknown database type");
        };
    }
}
