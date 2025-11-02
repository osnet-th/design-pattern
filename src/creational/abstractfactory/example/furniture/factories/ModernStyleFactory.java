package creational.abstractfactory.example.furniture.factories;

import creational.abstractfactory.example.furniture.chairs.Chair;
import creational.abstractfactory.example.furniture.chairs.ModernChair;
import creational.abstractfactory.example.furniture.tables.ModernTable;
import creational.abstractfactory.example.furniture.tables.Table;

public class ModernStyleFactory implements InteriorFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
