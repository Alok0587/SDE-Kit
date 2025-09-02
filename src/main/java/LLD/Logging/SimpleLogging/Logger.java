package LLD.Logging.SimpleLogging;

import java.io.BufferedWriter;
import java.io.IOException;

/*
    Logger class to log messages with different severity levels (INFO, DEBUG, ERROR).
    This is a simple implementation with singleton(bill pugh) pattern to ensure a single instance.
    Logs are written to a file named "app.log".
 */
enum LogLevel {
    INFO,
    DEBUG,
    ERROR
}
public class Logger {
    private static final String LOG_FILE = "app.log";
    private BufferedWriter writer;

    private  Logger() {
        try {
            this.writer = new BufferedWriter(new java.io.FileWriter(LOG_FILE, true));
        }catch (IOException e) {
            throw new RuntimeException("failed to initialize logger",e);
        }
    }
    public void log(String message, LogLevel level) {

        //to handle multi-threaded environment
        synchronized (this) {
            try {
                String logEntry = String.format("%s [%s]: %s%n", java.time.LocalDateTime.now(), level, message);
                writer.write(logEntry);
                writer.flush();
            } catch (IOException e) {
                System.err.println("Failed to write log: " + e.getMessage());
            }
        }

    }

    private static class LoggerHolder {
        private static final Logger INSTANCE = new Logger();
    }
    public static Logger getInstance() {
        return LoggerHolder.INSTANCE;
    }

}
