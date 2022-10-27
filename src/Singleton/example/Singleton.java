package Singleton.example;

/**
 * @author penko.peng
 */
public class Singleton {

    private static volatile Singleton singleton;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        try {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return singleton;
    }
}
