package HashMapImp.TwoHashMapProblem;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CustomCache<K,V> {
    private ConcurrentHashMap<K,V> map;
    private ConcurrentHashMap<K, TimestampMap<V>> timestampMap;
    private ScheduledExecutorService scheduledExecutorService;
    private final int TTL;
    public CustomCache(int TTL) {
        map = new ConcurrentHashMap<>();
        timestampMap = new ConcurrentHashMap<>();
        scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.scheduleAtFixedRate(this::cleanup,2000,10000L, TimeUnit.MILLISECONDS);
        this.TTL = TTL;
    }

    public void put(K key, V value) {
        map.put(key, value);
        timestampMap.put(key,new TimestampMap<>(value,System.currentTimeMillis()));
    }
    public V get(K key) {
        if (map.containsKey(key)) {
            if (System.currentTimeMillis() - timestampMap.get(key).timestamp > this.TTL) {
                timestampMap.remove(key);
                map.remove(key);
                return null;
            }
        }
        return map.get(key);
    }

    public void cleanup(){

        for(K key : timestampMap.keySet()){
            if(System.currentTimeMillis() - timestampMap.get(key).timestamp > this.TTL){
                timestampMap.remove(key);
                map.remove(key);
            }
        }
        System.out.println("Clean up complete");
    }

    public void shutdown(){
        scheduledExecutorService.shutdown();
    }

}
