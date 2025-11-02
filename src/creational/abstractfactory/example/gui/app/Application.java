package creational.abstractfactory.example.gui.app;

import creational.abstractfactory.example.gui.buttons.Button;
import creational.abstractfactory.example.gui.checkboxes.Checkbox;
import creational.abstractfactory.example.gui.factories.GUIFactory;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckBox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
