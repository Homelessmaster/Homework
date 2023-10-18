package SeventhSeminar.observer;

public interface Publisher {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

    void sendOffer(String companyName, Vacancy vacancy);

}
