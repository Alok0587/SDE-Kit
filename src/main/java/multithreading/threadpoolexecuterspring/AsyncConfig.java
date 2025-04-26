package multithreading.threadpoolexecuterspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;


@Configuration
public class AsyncConfig {

    /**
     * Here configuring how thread pool will be executed and their properties like the max pool size of max number of threads
     * @return
     */
    @Bean("taskExecutor")
    public ThreadPoolTaskExecutor threadPoolExecutor() {
        ThreadPoolTaskExecutor threadPoolExecutor=new ThreadPoolTaskExecutor();
        threadPoolExecutor.setCorePoolSize(10);
        threadPoolExecutor.setMaxPoolSize(20);
        threadPoolExecutor.setQueueCapacity(10000);
        threadPoolExecutor.setThreadNamePrefix("Async-");
        threadPoolExecutor.initialize();
        return threadPoolExecutor;
    }
}
