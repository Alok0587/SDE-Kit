package HashMapImp.CustomHashMap;

import java.util.LinkedList;

 class CustomHashMap<K,V>{

    class Entry{
        K key;
        V value;
        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
    //for separate Chaining
    LinkedList<Entry>[] entryList;
    double LOAD_FACTOR=0.75;
    int INITIAL_CAPACITY=16;
    int currSize =0;

    //this warning to hide warning from compiler when generic array of LinkedList is created
    @SuppressWarnings("unchecked")
    public CustomHashMap(){
        entryList=new LinkedList[INITIAL_CAPACITY];
        for(int i=0;i<INITIAL_CAPACITY;i++){
            entryList[i]=new LinkedList<>();
        }
    }

    public void put(K key, V value){
        //check for the array capacity
        float currLoadFactor= (float) currSize /INITIAL_CAPACITY;
        System.out.println("Curr load factor: "+currLoadFactor+" currSize: "+currSize+" initialCapacity: "+INITIAL_CAPACITY);
        if(currLoadFactor>LOAD_FACTOR){
            resize();
        }
        int hash=key.hashCode();
        int index=Math.abs(hash%INITIAL_CAPACITY);
        if(entryList[index]==null){
            entryList[index]=new LinkedList<Entry>();
            entryList[index].add(new Entry(key,value));

        }else{
            entryList[index].add(new Entry(key,value));
        }
        currSize = currSize +1;
    }
    public V get(K key){
        int hash=key.hashCode();
        int index=Math.abs(hash%INITIAL_CAPACITY);
        if(index<INITIAL_CAPACITY && entryList[index]!=null){
            for(Entry entry:entryList[index]){
                if(entry.key.equals(key)){
                    return entry.value;
                }
            }
        }
        System.out.print("Key not found");
        return null;
    }
    public V remove(K key){
        int hash=key.hashCode();
        int index=hash%INITIAL_CAPACITY;
        if(index<INITIAL_CAPACITY && entryList[index]!=null){
            for(Entry entry:entryList[index]){
                if(entry.key.equals(key)){
                    V value=entry.value;
                    entryList[index].remove(entry);
                    currSize = currSize -1;
                    return value;

                }
            }
        }
        System.out.print("Key not found");
        return null;
    }

     @SuppressWarnings("unchecked")
     private void resize() {
        System.out.println("Resizing the map");
        LinkedList<Entry>[] newEntryList=new LinkedList[INITIAL_CAPACITY*2];
        INITIAL_CAPACITY=INITIAL_CAPACITY*2;

        //re-hashing the value
        for(int i = 0; i< entryList.length; i++){
            LinkedList<Entry> prev=entryList[i];
            if(prev!=null){
                for(Entry entry:prev){
                    K key=entry.key;
                    V value=entry.value;
                    int newHash=key.hashCode();
                    int index=Math.abs(newHash%INITIAL_CAPACITY);
                    if(newEntryList[index]==null){
                        newEntryList[index]=new LinkedList<Entry>();
                    }
                    newEntryList[index].add(new Entry(key,value));
                }
            }


        }
        for(int i = 0; i< newEntryList.length; i++){
            if(newEntryList[i]==null){
                newEntryList[i]=new LinkedList<Entry>();
            }
        }
        entryList=newEntryList;
     }

     public static void main(String[] args) {
        CustomHashMap<String, Integer> myMap=new CustomHashMap<>();
        System.out.println(myMap.get("one"));
        for(int i=0;i<50;i++){
            myMap.put(i+"#",i);
        }
         myMap.remove("1#");
         myMap.remove("10#");
         for(int i=0;i<40;i++){
             System.out.println(myMap.get(i+"#"));
         }
         myMap.put("Special",100876);
         System.out.println(myMap.get("Special"));

     }
 }
