package Observer.improve;

//接口, 让WeatherData 来实现

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

}
