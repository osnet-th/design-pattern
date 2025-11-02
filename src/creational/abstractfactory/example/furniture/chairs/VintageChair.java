package creational.abstractfactory.example.furniture.chairs;

public class VintageChair implements Chair {
    @Override
    public void sit() {
        System.out.println("This VintageChair Sit");
    }
}
