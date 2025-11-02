package creational.abstractfactory.example.gui.factories;

import creational.abstractfactory.example.gui.buttons.Button;
import creational.abstractfactory.example.gui.buttons.MacOSButton;
import creational.abstractfactory.example.gui.checkboxes.Checkbox;
import creational.abstractfactory.example.gui.checkboxes.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new MacOSCheckbox();
    }

}
