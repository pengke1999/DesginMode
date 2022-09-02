package observer.example;

import java.util.List;

/**
 * @author penko.peng
 */
public class WeatherData implements Subject{


    private List<Observer> observers;
    /**
     * 天气数据
     */
    private Object data;

    @Override
    public void registerObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(observer -> observer.update(data));
    }

    public void setData(Object o) {
        this.data = o;
        notifyObserver();
    }
}
