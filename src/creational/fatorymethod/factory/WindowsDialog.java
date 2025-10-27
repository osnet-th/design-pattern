package creational.fatorymethod.factory;

import creational.fatorymethod.buttons.Button;
import creational.fatorymethod.buttons.HtmlButton;
import creational.fatorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
