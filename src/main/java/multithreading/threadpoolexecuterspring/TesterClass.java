package multithreading.threadpoolexecuterspring;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class TesterClass {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> data = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            data.add(i);
        }
        BatchProcessingService batchProcessingService = new BatchProcessingService();

        System.out.println("Batch processing started");
        Long startTimeMulti = System.currentTimeMillis();
        batchProcessingService.process(data);
        Long endTimeMulti = System.currentTimeMillis();
        System.out.println("Batch processing finished");


        /**
         * Trying without multithreading
         */

        Long startTime = System.currentTimeMillis();
        for(int i=0;i<data.size();i++){
            //adding some cpu intensive task
            double result = Math.pow(i, 2) + Math.sqrt(i);
            System.out.println("processing the data"+result);
        }
        Long endTime = System.currentTimeMillis();
        System.out.println("Total time taken in millis without multithreading "+(endTime-startTime));
        System.out.println("Total time taken in millis with multithreading "+(endTimeMulti-startTimeMulti));
    }
}

/**
 * FOr this example single threaded process is taking less time may be because of the operation
 */