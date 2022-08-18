package adapter;

public class AmericanOvenAdapter implements ElectricalDevices{

    AmericanOven ao = new AmericanOven();

    @Override
    public void turnOn() {
        ao.turnOn(110);
    }

    @Override
    public void turnOff() {
        ao.turnOff();
    }

    @Override
    public boolean isRunning() {
        return ao.isRunning();
    }
}
