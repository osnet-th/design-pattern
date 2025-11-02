package creational.abstractfactory.example.furniture.interior;

import creational.abstractfactory.example.furniture.chairs.Chair;
import creational.abstractfactory.example.furniture.factories.InteriorFactory;
import creational.abstractfactory.example.furniture.tables.Table;

public class InteriorClient {
    private final Chair chair;
    private final Table table;

    public InteriorClient(InteriorFactory interiorFactory) {
        chair = interiorFactory.createChair();
        table = interiorFactory.createTable();
    }

    public void set() {
        chair.sit();
        table.spaceProvide();
    }
}
