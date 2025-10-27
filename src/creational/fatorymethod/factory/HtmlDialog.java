package creational.fatorymethod.factory;

import creational.fatorymethod.buttons.Button;
import creational.fatorymethod.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
