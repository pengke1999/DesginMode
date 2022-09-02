package observer.example;

/**
 * @author penko.peng
 */
public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
