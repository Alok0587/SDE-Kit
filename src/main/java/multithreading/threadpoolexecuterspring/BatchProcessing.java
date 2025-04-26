package multithreading.threadpoolexecuterspring;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class BatchProcessing {

    /**
     * Using multithreading to process each batches with the available threads
     * @param batch
     * @return
     */
    @Async("taskExecutor")
    public CompletableFuture<Void> processBatch(List<Integer> batch) {
        batch.forEach(item->{

            //adding some cpu intensive task
            double it= Math.pow(item, 2) + Math.sqrt(item);
            System.out.println("Processing "+it+" Using thread: "+Thread.currentThread().getName());
        });
        return CompletableFuture.completedFuture(null);
    }

}
