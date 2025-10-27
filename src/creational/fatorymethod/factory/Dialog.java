package creational.fatorymethod.factory;

import creational.fatorymethod.buttons.Button;

public abstract class Dialog {
    public void renderWindow() {
        Button okButton = createButton();
        okButton.render();
    }

    public abstract Button createButton();
}
