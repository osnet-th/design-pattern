package creational.builder;

import creational.builder.builders.PhoneBuilder;
import creational.builder.builders.PhoneManualBuilder;
import creational.builder.phones.Phone;

public class PhoneExample {
    public static void main(String[] args) {
        PhoneDirector director = new PhoneDirector();
        PhoneBuilder builder = new PhoneBuilder();
        director.constructIPhone(builder);

        Phone iphone = builder.getResult();
        System.out.println(iphone.getName());
        System.out.println(iphone.getType());

        PhoneManualBuilder manualBuilder = new PhoneManualBuilder();
        director.constructIPhone(manualBuilder);
        System.out.println(manualBuilder.getResult().print());

    }
}
