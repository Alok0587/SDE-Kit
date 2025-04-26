package multithreading.threadpoolexecuterspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

@Component
public class BatchProcessingService {


    BatchProcessing batchProcessing=new BatchProcessing();

    public void process(List<Integer> data) throws ExecutionException, InterruptedException {
           int batchSize = 1000;

           List<CompletableFuture<Void>> futures = new ArrayList<>();
           for(int i=0;i<data.size();i+=batchSize){
               CompletableFuture<Void> future=batchProcessing.processBatch(data.subList(i,Math.min(i+batchSize,data.size())));
               futures.add(future);
           }
           CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).get();


    }
}
