package multithreading.producerconsumerproblem;

import static java.lang.Thread.sleep;

public class Producer {

    SharedResource sharedResource;
    Producer(SharedResource sharedResource) {
        this.sharedResource=sharedResource;
    }
    public void produce() throws InterruptedException {
        int value=0;
        while(true){
            synchronized (sharedResource){
                if(sharedResource.isFull()){
                    sharedResource.notify();
                    sharedResource.wait();
                }
                System.out.println("Produced: "+value);

                sharedResource.getResource().add(value++);

                //wake up consumer thread
                sharedResource.notify();

                // Thread.sleep(1000); // Optional: to slow down the production for better visibility
                sleep(1000);
            }
        }
    }
}
