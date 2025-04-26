package multithreading;

public class ThreadUsingRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread->"+Thread.currentThread().getName()+" is running");
    }


    public static void main(String[] args) {
        ThreadUsingRunnable example = new ThreadUsingRunnable();
        Thread thread = new Thread(example);
        Thread thread2 = new Thread(example);
        thread.start();
        thread2.start();

    }
}
