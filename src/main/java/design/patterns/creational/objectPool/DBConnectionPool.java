package design.patterns.creational.objectPool;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DBConnectionPool {
    private final BlockingQueue<DBConnection> connectionPool;
    public DBConnectionPool(int capacity) {
        connectionPool = new LinkedBlockingQueue<>();
        for (int i = 0; i < capacity; i++) {
            connectionPool.add(new DBConnection("SQL Data Connection-"+i));
        }
    }
    public DBConnection getConnection() throws InterruptedException {
            return connectionPool.take();
    }
    public void returnConnection(DBConnection connection) {
        connectionPool.offer(connection);
    }
}
