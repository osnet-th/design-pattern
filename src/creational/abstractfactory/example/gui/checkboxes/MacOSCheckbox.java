package creational.abstractfactory.example.gui.checkboxes;

public class MacOSCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("MacOS Checkbox");
    }
}
