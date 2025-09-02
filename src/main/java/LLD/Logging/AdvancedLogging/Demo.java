package LLD.Logging.AdvancedLogging;

public class Demo {

    Runnable task = () -> {
        AsyncLogger logger = AsyncLogger.getInstance();
        for (int i = 0; i < 10; i++) {
            logger.log("Log message " + i + " from " + Thread.currentThread().getName(), LogLevel.INFO);
        }
    };
    public static void main(String[] args) {
        Demo demo = new Demo();
        Thread thread1 = new Thread(demo.task, "Thread-1");
        Thread thread2 = new Thread(demo.task, "Thread-2");
        thread1.start();
        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Logging completed. Check app.log file.");
    }
}
