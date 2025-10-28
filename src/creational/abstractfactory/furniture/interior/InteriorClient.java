package creational.abstractfactory.furniture.interior;

import creational.abstractfactory.furniture.chairs.Chair;
import creational.abstractfactory.furniture.factories.InteriorFactory;
import creational.abstractfactory.furniture.tables.Table;

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
