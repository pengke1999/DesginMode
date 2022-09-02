package observer.example;

public class CurrentDisplay implements Observer{

    private Object data;

    private Subject subject;

    public CurrentDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    


    @Override
    public void update(Object data) {
        System.err.println("处理观察订阅到的信息");
    }
}
