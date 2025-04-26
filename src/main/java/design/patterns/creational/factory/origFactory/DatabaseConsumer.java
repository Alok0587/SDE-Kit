package design.patterns.creational.factory.origFactory;

public class DatabaseConsumer {
    public static void main(String[] args) {


        Database sb = (Database) new SqlDriver().getDatabase();
        System.out.println(sb.getName());
    }
}
