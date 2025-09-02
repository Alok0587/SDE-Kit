package LLD.Logging.SimpleLogging;

public class Demo {
    public static void main(String[] args) {

       Runnable task = () -> {
            Logger logger = Logger.getInstance();
            logger.log("This is an info message", LLD.Logging.SimpleLogging.LogLevel.INFO);
            logger.log("This is a debug message", LLD.Logging.SimpleLogging.LogLevel.DEBUG);
            logger.log("This is an error message", LLD.Logging.SimpleLogging.LogLevel.ERROR);
        };

        // Simulating multiple threads logging messages
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Logging completed. Check app.log for log entries.");
    }
}
