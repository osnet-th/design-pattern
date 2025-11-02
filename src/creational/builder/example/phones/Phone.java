package creational.builder.example.phones;

import creational.builder.example.components.Battery;
import creational.builder.example.components.Display;
import creational.builder.example.components.OperatingSystem;

public class Phone {
    private final String name;
    private final PhoneType type;
    private final OperatingSystem operatingSystem;
    private final Display display;
    private final Battery battery;
    private int app;


    public Phone(String name, PhoneType type, OperatingSystem operatingSystem, Display display, Battery battery) {
        this.name = name;
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.display = display;
        this.battery = battery;
    }

    public String getName() {
        return name;
    }

    public PhoneType getType() {
        return type;
    }

    public void setApp(int app) {
        this.app = app;
    }
    public int getApp() {
        return app;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public Display getDisplay() {
        return display;
    }

    public Battery getBattery() {
        return battery;
    }
}
