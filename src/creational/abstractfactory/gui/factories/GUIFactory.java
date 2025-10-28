package creational.abstractfactory.gui.factories;

import creational.abstractfactory.gui.buttons.Button;
import creational.abstractfactory.gui.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
