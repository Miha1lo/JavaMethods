package ua.ithillel.java.hw2;

public class Engine {

    private int power;
    private double engineVolume;
    private int cilinders;

    public void printEngineInfo() {
        System.out.println("Engine characteristics: ");
        System.out.println("\t-Power: " + power);
        System.out.println("\t-Engine volume: " + engineVolume);
        System.out.println("\t-Amount of cilinders: " + cilinders);
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public int getCilinders() {
        return cilinders;
    }

    public void setCilinders(int cilinders) {
        this.cilinders = cilinders;
    }
}
