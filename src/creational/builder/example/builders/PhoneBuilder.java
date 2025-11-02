package creational.builder.example.builders;

import creational.builder.example.components.Battery;
import creational.builder.example.components.Display;
import creational.builder.example.components.OperatingSystem;
import creational.builder.example.phones.Phone;
import creational.builder.example.phones.PhoneType;

public class PhoneBuilder implements Builder {
    private String name;
    private PhoneType phoneType;
    private OperatingSystem operatingSystem;
    private Display display;
    private Battery battery;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPhoneType(PhoneType type) {
        this.phoneType = type;
    }

    @Override
    public void setOperatingSystem(OperatingSystem os) {
        this.operatingSystem = os;
    }

    @Override
    public void setDisplay(Display display) {
        this.display = display;
    }

    @Override
    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public Phone getResult() {
        return new Phone(name, phoneType, operatingSystem, display, battery);
    }
}
