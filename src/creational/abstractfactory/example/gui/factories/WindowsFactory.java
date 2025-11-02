package creational.abstractfactory.example.gui.factories;

import creational.abstractfactory.example.gui.buttons.Button;
import creational.abstractfactory.example.gui.buttons.WindowsButton;
import creational.abstractfactory.example.gui.checkboxes.Checkbox;
import creational.abstractfactory.example.gui.checkboxes.WindowsCheckbox;

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
