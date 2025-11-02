package creational.singleton.example;

public class SingletonSample {

    private static SingletonSample instance;
    private String value;

    private SingletonSample(String value) {
        this.value = value;
    }

    public static SingletonSample getInstance(String value) {
        if (instance == null) {
            instance = new SingletonSample(value);
        }
        return instance;
    }

    public String getString() {
        return this.value;
    }
}
