package creational.abstractfactory.furniture.factories;

import creational.abstractfactory.furniture.chairs.Chair;
import creational.abstractfactory.furniture.chairs.ModernChair;
import creational.abstractfactory.furniture.tables.ModernTable;
import creational.abstractfactory.furniture.tables.Table;
import creational.abstractfactory.furniture.tables.VintageTable;

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
