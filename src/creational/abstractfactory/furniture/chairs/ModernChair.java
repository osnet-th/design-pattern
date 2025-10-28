package creational.abstractfactory.furniture.chairs;

public class ModernChair implements Chair {
    @Override
    public void sit() {
        System.out.println("This ModernChair Sit");
    }
}
