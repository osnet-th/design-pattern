package creational.abstractfactory.example.furniture.factories;

import creational.abstractfactory.example.furniture.chairs.Chair;
import creational.abstractfactory.example.furniture.chairs.VintageChair;
import creational.abstractfactory.example.furniture.tables.Table;
import creational.abstractfactory.example.furniture.tables.VintageTable;

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
