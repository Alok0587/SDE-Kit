package multithreading.producerconsumerproblem;

import java.util.List;

public class Consumer {
    SharedResource sharedResource;
    Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    public void consume(){
        while(true){
            synchronized (sharedResource){
                if(sharedResource.isEmpty()){
                    try {
                        sharedResource.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                List<Integer> resource = sharedResource.getResource();
                int value = resource.remove(0);
                System.out.println("Consumed: "+value);

                //wake up producer thread
                sharedResource.notify();

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
