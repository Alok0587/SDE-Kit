package design.patterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class NewsAgency implements Subject {
    private final List<Observer> observers=new ArrayList<>();
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news){
        for(Observer observer:observers){
            observer.update(news);
        }
    }

    public  void publishNews(String news){
        notifyObservers(news);
    }

}
