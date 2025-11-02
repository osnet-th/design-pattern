package creational.builder.example.phones;

import creational.builder.example.components.Battery;
import creational.builder.example.components.Display;
import creational.builder.example.components.OperatingSystem;

public class Manual {
    private final String name;
    private final PhoneType type;
    private final OperatingSystem operatingSystem;
    private final Display display;
    private final Battery battery;

    public Manual(String name, PhoneType type, OperatingSystem operatingSystem, Display display, Battery battery) {
        this.name = name;
        this.type = type;
        this.operatingSystem = operatingSystem;
        this.display = display;
        this.battery = battery;
    }

    public String print() {
        return "Manual{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", operatingSystem=" + operatingSystem +
                ", display=" + display +
                ", battery=" + battery +
                '}';
    }
}
