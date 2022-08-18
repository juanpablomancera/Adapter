package adapter;

public class Fridge implements ElectricalDevices{

    boolean isRunning = false;

    @Override
    public void turnOff() {
        isRunning = false;
    }

    @Override
    public void turnOn() {
        isRunning = true;
    }

    @Override
    public boolean isRunning() {
        return isRunning;
    }
}
