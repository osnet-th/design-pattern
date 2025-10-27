package creational.fatorymethod;

import creational.fatorymethod.factory.Dialog;
import creational.fatorymethod.factory.HtmlDialog;
import creational.fatorymethod.factory.WindowsDialog;

public class FactoryExample {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure() {
        if(System.getProperty("os.name").toLowerCase().contains("mac")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }

}
