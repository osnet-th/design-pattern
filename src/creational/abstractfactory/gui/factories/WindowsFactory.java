package creational.abstractfactory.gui.factories;

import creational.abstractfactory.gui.buttons.Button;
import creational.abstractfactory.gui.buttons.WindowsButton;
import creational.abstractfactory.gui.checkboxes.Checkbox;
import creational.abstractfactory.gui.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new WindowsCheckbox();
    }

}
