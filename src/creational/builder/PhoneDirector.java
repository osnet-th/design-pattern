package creational.builder;

import creational.builder.builders.Builder;
import creational.builder.components.Battery;
import creational.builder.components.Display;
import creational.builder.components.OperatingSystem;
import creational.builder.phones.OsType;
import creational.builder.phones.PhoneType;

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
