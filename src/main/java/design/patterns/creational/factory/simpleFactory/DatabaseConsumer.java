package design.patterns.creational.factory.simpleFactory;

public class DatabaseConsumer {
    public static void main(String[] args) {

        Database sqlDB= DatabaseFactory.getDatabase("MySql");
        Database PostgreSQL= DatabaseFactory.getDatabase("PostgreSQL");
        System.out.println("DB::"+sqlDB);
            System.out.println(sqlDB.getName());
            System.out.println(PostgreSQL.getName());

    }
}
