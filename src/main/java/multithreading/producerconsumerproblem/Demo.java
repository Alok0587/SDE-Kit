package multithreading.producerconsumerproblem;

public class Demo {

    /*
    Producer-Consumer Problem:
    A classic example of a multi-threading problem where one thread (the producer) generates data
    and places it into a shared resource (like a buffer), while another thread (the consumer)
    takes data from that shared resource. The challenge is to ensure that the producer does not
    add data to a full buffer and the consumer does not try to remove data from an empty buffer.
    This requires proper synchronization between the producer and consumer threads.
     */
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();
        Producer producer = new Producer(sharedResource);
        Consumer consumer = new Consumer(sharedResource);

        Thread producerThread = new Thread(() -> {
            try {
                producer.produce();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread consumerThread = new Thread(consumer::consume);

        producerThread.start();
        consumerThread.start();
    }
}
