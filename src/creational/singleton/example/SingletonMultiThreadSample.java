package creational.singleton.example;

public class SingletonMultiThreadSample {

    private static SingletonMultiThreadSample instance;
    private String value;

    private SingletonMultiThreadSample(String value) {
        this.value = value;
    }

    public static SingletonMultiThreadSample getInstance(String value) {
        SingletonMultiThreadSample sample = instance;
        if(sample != null) {
            return sample;
        }
        synchronized (SingletonMultiThreadSample.class) {
            if (instance == null) {
                instance = new SingletonMultiThreadSample(value);
            }
            return instance;
        }
    }

    public String getString() {
        return "싱글턴 패턴 연습중입니다.";
    }
}
