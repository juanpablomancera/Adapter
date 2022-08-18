package adapter;

public class AmericanOven {

    boolean isRunning = false;
    int voltage = 0;

    boolean turnOn(int voltage){
        if (voltage != 110){
            this.voltage = voltage;
            return false;
        }
        else{
            isRunning = true;
            return true;
        }
    }

    void turnOff(){
        isRunning = false;
    }

    boolean isRunning(){
        return isRunning;
    }
}
