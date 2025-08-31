package multithreading.producerconsumerproblem;

import java.util.ArrayList;
import java.util.List;

public class SharedResource {
    List<Integer> resource;
    int capacity = 2;
    SharedResource(){
        this.resource = new ArrayList<>();
    }
    public List<Integer> getResource() {
        return resource;
    }
    public boolean isFull() {
        return resource.size() == capacity;
    }
    public boolean isEmpty() {
        return resource.size() == 0;
    }

}
