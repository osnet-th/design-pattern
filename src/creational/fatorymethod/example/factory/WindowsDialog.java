package creational.fatorymethod.example.factory;

import creational.fatorymethod.example.buttons.Button;
import creational.fatorymethod.example.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
