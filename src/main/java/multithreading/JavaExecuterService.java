package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is running");
    }
}
public class JavaExecuterService {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(new Task());
        executorService.execute(new Task());
        executorService.execute(new Task());
        executorService.shutdown();
    }

}
