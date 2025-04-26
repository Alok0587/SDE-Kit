package multithreading;

public class ThreadUsingThreadClass extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println(Thread.currentThread().getName()+" is running.");
    }
    public static void main(String[] args) {
        ThreadUsingThreadClass thread = new ThreadUsingThreadClass();
        thread.start();
        ThreadUsingThreadClass thread2 = new ThreadUsingThreadClass();
        thread2.start();
    }
}
