package creational.abstractfactory.example.furniture.factories;

import creational.abstractfactory.example.furniture.chairs.Chair;
import creational.abstractfactory.example.furniture.tables.Table;

public interface InteriorFactory {
    Chair createChair();
    Table createTable();
}
