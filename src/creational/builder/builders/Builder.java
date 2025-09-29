package creational.builder.builders;


import creational.builder.phones.PhoneType;
import creational.builder.components.Battery;
import creational.builder.components.Display;
import creational.builder.components.OperatingSystem;

// 스마트폰 빌더
public interface Builder {
    void setName(String name);
    void setPhoneType(PhoneType type);
    void setOperatingSystem(OperatingSystem os);
    void setDisplay(Display display);
    void setBattery(Battery battery);

}
