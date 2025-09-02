package LLD.Logging.AdvancedLogging;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/*
    AsyncLogger class to log messages with different severity levels (INFO, DEBUG, ERROR).
    This implementation uses a blocking queue to handle log messages asynchronously.
    Logs are written to a file named "app.log".

    This is how log4j works in the backend.
 */
enum LogLevel {
    INFO,
    DEBUG,
    ERROR
}
public class AsyncLogger {
    BlockingQueue<String> logQueue;
    private static final String LOG_FILE = "app.log";
    BufferedWriter bufferedWriter;
    Thread logWriterThread;
    Boolean running = true;
    private AsyncLogger() {
        this.logQueue = new LinkedBlockingQueue<>(100);
        try {
            this.bufferedWriter = new BufferedWriter(new FileWriter(LOG_FILE, true));
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize logger", e);
        }

        logWriterThread = new Thread(() -> {
            while (running) {
                try {
                    String logEntry = logQueue.take();
                    synchronized (this) {
                        bufferedWriter.write(logEntry);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                } catch (Exception e) {
                    System.err.println("Failed to write log: " + e.getMessage());
                }
            }
        });

        logWriterThread.start();

    }
    public void log(String message, LogLevel level) {
        String logEntry = String.format("%s [%s]: %s%n", java.time.LocalDateTime.now(), level, message);
        try {
            logQueue.put(logEntry);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("Failed to enqueue log: " + e.getMessage());
        }
    }

    private static class LoggerHolder {
        private static final AsyncLogger INSTANCE = new AsyncLogger();

    }
    public static AsyncLogger getInstance() {
        return LoggerHolder.INSTANCE;
    }

    public void close() {
        logWriterThread.interrupt();
        running = false;
        try {
            logWriterThread.join();
            synchronized (this) {
                bufferedWriter.close();
            }
        } catch (Exception e) {
            System.err.println("Failed to close logger: " + e.getMessage());
        }
    }

}
