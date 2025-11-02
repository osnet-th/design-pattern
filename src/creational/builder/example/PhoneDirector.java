package creational.builder.example;

import creational.builder.example.builders.Builder;
import creational.builder.example.components.Battery;
import creational.builder.example.components.Display;
import creational.builder.example.components.OperatingSystem;
import creational.builder.example.phones.OsType;
import creational.builder.example.phones.PhoneType;

public class PhoneDirector {

    public void constructIPhone(Builder builder) {
        builder.setBattery(new Battery(5000, 300, 200));
        builder.setDisplay(new Display(5.3, "LCD", "1240*1210"));
        builder.setName("IPhone SE3");
        builder.setPhoneType(PhoneType.IPHONE);
        builder.setOperatingSystem(new OperatingSystem("IOS26", OsType.IOS));
    }

    public void constructGalaxy(Builder builder) {
        builder.setBattery(new Battery(3500, 300, 300));
        builder.setDisplay(new Display(6.3, "OLED", "1240*1210"));
        builder.setName("Galaxy S25");
        builder.setPhoneType(PhoneType.GALAXY);
        builder.setOperatingSystem(new OperatingSystem("AOS13", OsType.AOS));
    }
}
