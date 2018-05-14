package patterns.singleton;


public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    /**
     * Create a single instance of patterns.creational.singleton class
     *
     * @return Singleton
     */
    public synchronized static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}