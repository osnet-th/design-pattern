package creational.abstractfactory.furniture.factories;

import creational.abstractfactory.furniture.chairs.Chair;
import creational.abstractfactory.furniture.tables.Table;

public interface InteriorFactory {
    Chair createChair();
    Table createTable();
}
