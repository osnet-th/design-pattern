package creational.abstractfactory.furniture;

import creational.abstractfactory.furniture.factories.InteriorFactory;
import creational.abstractfactory.furniture.factories.ModernStyleFactory;
import creational.abstractfactory.furniture.factories.VintageStyleFactory;
import creational.abstractfactory.furniture.interior.InteriorClient;

public class Demo {

    private static InteriorClient configureInterior(String style) {
        InteriorFactory interiorFactory;
        if(style.toLowerCase().contains("vintage")) {
            interiorFactory = new VintageStyleFactory();
        } else {
            interiorFactory = new ModernStyleFactory();
        }
        return new InteriorClient(interiorFactory);
    }

    public static void main(String[] args) {
        InteriorClient interiorClient = configureInterior("vintage");
        interiorClient.set();
    }
}
