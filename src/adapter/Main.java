package adapter;

public class Main {
    public static void main(String[] args) {

        Fridge fr = new Fridge();
        AmericanOvenAdapter ao = new AmericanOvenAdapter();

        fr.turnOn();
        ao.turnOn();

        System.out.println(fr.isRunning());
        System.out.println(ao.isRunning());
    }
}
