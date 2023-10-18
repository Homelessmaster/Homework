package SeventhSeminar.observer;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void sendOffer(String companyName, Vacancy vacancy) {
        for (int i = 0; i < observers.size(); i++) {
            Observer observer = observers.get(i);
            boolean check = observer.receiveOffer(companyName, vacancy);
            if(check){
                removeObserver(observer);
            }
        }   
    }
}
