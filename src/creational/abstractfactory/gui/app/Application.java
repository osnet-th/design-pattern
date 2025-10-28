package creational.abstractfactory.gui.app;

import creational.abstractfactory.gui.buttons.Button;
import creational.abstractfactory.gui.checkboxes.Checkbox;
import creational.abstractfactory.gui.factories.GUIFactory;

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
