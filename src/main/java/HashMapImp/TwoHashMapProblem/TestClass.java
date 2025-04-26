package HashMapImp.TwoHashMapProblem;

public class TestClass {

    public static void main(String[] args) throws InterruptedException {
        CustomCache<String,String> cache=new CustomCache<>(6000);

            //Add in cache
        cache.put("key1","value1");
        cache.put("key2","value2");
        cache.put("key3","value3");
        cache.put("key4","value4");
        cache.put("key5","value5");
        cache.put("key6","value6");

        Thread.sleep(4000L);

        System.out.println(cache.get("key1"));
        System.out.println(cache.get("key2"));

        Thread.sleep(2000L);

        System.out.println(cache.get("After 2 more seconds"));

        System.out.println(cache.get("key1"));
        System.out.println(cache.get("key2"));

    }
}
