package ua.ithillel.java.hw2;

public class TestCar {

    public static void main(String[] args) {

        Car sedan = new Car("Lancer IX", "Black");

        Engine engineSedan = new Engine();
        engineSedan.setCilinders(4);
        engineSedan.setPower(99);
        engineSedan.setEngineVolume(1.6);

        Transmission transmissionSedan = new Transmission();
        transmissionSedan.setType("Mechanical");

        Wheel tiresTypeSedan = new Wheel();
        tiresTypeSedan.setTiresType(new String[]{"TOYO", "Nokian", "Continental", "Bridgestone"});

        sedan.PrintInfoCar(engineSedan, transmissionSedan,tiresTypeSedan);
    }
}