package creational.fatorymethod.example.factory;

import creational.fatorymethod.example.buttons.Button;
import creational.fatorymethod.example.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }

}
