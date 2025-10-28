package creational.abstractfactory.gui.factories;

import creational.abstractfactory.gui.buttons.Button;
import creational.abstractfactory.gui.buttons.MacOSButton;
import creational.abstractfactory.gui.checkboxes.Checkbox;
import creational.abstractfactory.gui.checkboxes.MacOSCheckbox;

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
