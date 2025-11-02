package creational.abstractfactory.example.gui.factories;

import creational.abstractfactory.example.gui.buttons.Button;
import creational.abstractfactory.example.gui.checkboxes.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
