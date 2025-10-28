package creational.abstractfactory.gui;

import creational.abstractfactory.gui.app.Application;
import creational.abstractfactory.gui.factories.GUIFactory;
import creational.abstractfactory.gui.factories.MacOSFactory;
import creational.abstractfactory.gui.factories.WindowsFactory;

public class Demo {

    private static Application configureApplication() {
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        return new Application(factory);
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
