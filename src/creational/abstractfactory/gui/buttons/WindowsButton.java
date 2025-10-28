package creational.abstractfactory.gui.buttons;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Windows 버튼");
    }
}
