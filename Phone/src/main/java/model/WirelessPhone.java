package model;

public abstract class WirelessPhone extends SomeAbstractPhone {
    private int battery;

    public WirelessPhone(int yearProduction, String manufactured, int battery) {
        super(yearProduction, manufactured);
        this.battery = battery;
    }
}
