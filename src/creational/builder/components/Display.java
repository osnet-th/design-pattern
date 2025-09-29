package creational.builder.components;

public class Display {
    private double inch;
    private String panel;
    private String resolution;
    private boolean displayOn;

    public Display(double inch, String panel, String resolution) {
        this.inch = inch;
        this.panel = panel;
        this.resolution = resolution;
    }

    public void on() {
        displayOn = true;
    }

    public void off() {
        displayOn = false;
    }

    public boolean isOn() {
        return displayOn;
    }

    public double getInch() {
        return inch;
    }
    public String getPanel() {
        return panel;
    }
    public String getResolution() {
        return resolution;
    }

    @Override
    public String toString() {
        return "Display{" +
                "inch=" + inch +
                ", panel='" + panel + '\'' +
                ", resolution='" + resolution + '\'' +
                ", displayOn=" + displayOn +
                '}';
    }
}
