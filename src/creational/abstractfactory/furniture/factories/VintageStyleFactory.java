package creational.abstractfactory.furniture.factories;

import creational.abstractfactory.furniture.chairs.Chair;
import creational.abstractfactory.furniture.chairs.VintageChair;
import creational.abstractfactory.furniture.tables.Table;
import creational.abstractfactory.furniture.tables.VintageTable;

public class VintageStyleFactory implements InteriorFactory {
    @Override
    public Chair createChair() {
        return new VintageChair();
    }

    @Override
    public Table createTable() {
        return new VintageTable();
    }
}
