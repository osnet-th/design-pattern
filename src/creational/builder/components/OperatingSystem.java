package creational.builder.components;

import creational.builder.phones.OsType;

public class OperatingSystem {
    private String version;
    private OsType osType;

    public OperatingSystem(String version, OsType osType) {
        this.version = version;
        this.osType = osType;
    }

    public String getVersion() {
        return version;
    }
    public OsType getOsType() {
        return osType;
    }

    @Override
    public String toString() {
        return "OperatingSystem{" +
                "version='" + version + '\'' +
                ", osType=" + osType +
                '}';
    }
}
