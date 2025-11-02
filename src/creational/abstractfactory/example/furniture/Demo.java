package creational.abstractfactory.example.furniture;

import creational.abstractfactory.example.furniture.factories.InteriorFactory;
import creational.abstractfactory.example.furniture.factories.ModernStyleFactory;
import creational.abstractfactory.example.furniture.factories.VintageStyleFactory;
import creational.abstractfactory.example.furniture.interior.InteriorClient;

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
