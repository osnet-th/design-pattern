package creational.builder.example.components;

public class Battery {
    private int capacity;
    private int width;
    private int height;
    private boolean charging;

    public Battery(int capacity, int width, int height) {
        this.capacity = capacity;
        this.width = width;
        this.height = height;
    }
    public void charge() {
        charging = true;
    }
    public void unplug() {
        charging = false;
    }
    public boolean isCharging() {
        return charging;
    }
    public int getCapacity() {
        return capacity;
    }
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }
    @Override
    public String toString() {
        return "Battery{" +
                "capacity=" + capacity +
                ", width=" + width +
                ", height=" + height +
                ", charging=" + charging +
                '}';
    }
}
