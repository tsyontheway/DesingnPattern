package Observer.improve;


import java.util.ArrayList;

/**
 * 类是核心
 * 1. 包含最新的天气情况信息
 * 2. 含有 观察者集合，使用ArrayList管理
 * 3. 当数据有更新时，就主动的调用   ArrayList, 通知所有的（接入方）就看到最新的信息
 */
public class WeatherData implements Subject {
    private float temperature;
    private float pressure;
    private float humidity;

    private ArrayList<Observer> mObservers;


    //加入新的第三方


    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }


    //当数据有更新时，就调用 notifyObservers 通知所有观察者
    public void setData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        notifyObservers();
    }

    //注册一个观察者

    @Override
    public void registerObserver(Observer observer) {
        mObservers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        if (mObservers.contains(observer)) {
            mObservers.remove(observer);
        }
    }

    //遍历所有的观察者，并通知
    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(getTemperature(), getPressure(), getHumidity());
        }
    }
}
