package structural.decorator.example;

/**
 * 읽기 및 쓰기 작업을 정의하는 공통 데이터 인터페이스
 *
 */
public interface DataSource {
    void writeData(String data);
    String readData();
}
