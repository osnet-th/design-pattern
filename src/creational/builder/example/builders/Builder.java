package creational.builder.example.builders;


import creational.builder.example.phones.PhoneType;
import creational.builder.example.components.Battery;
import creational.builder.example.components.Display;
import creational.builder.example.components.OperatingSystem;

// 스마트폰 빌더
public interface Builder {
    void setName(String name);
    void setPhoneType(PhoneType type);
    void setOperatingSystem(OperatingSystem os);
    void setDisplay(Display display);
    void setBattery(Battery battery);

}
