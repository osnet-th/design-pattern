package creational.abstractfactory.example.gui.buttons;

public class MacOSButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows 버튼");
    }
}
