package creational.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        SingletonSample sample = SingletonSample.getInstance("싱글턴 연습중입니다.");
        String str = sample.getString();
        System.out.println(str);
    }

}
