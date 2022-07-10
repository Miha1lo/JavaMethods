package ua.ithillel.java.hw2;

public class TestCar {

    public static void main(String[] args) {

        Car sedan = new Car("Lancer", "Black");

        Engine engineSedan = new Engine();
        engineSedan.setCilinders(4);
        engineSedan.setPower(99);
        engineSedan.setEngineVolume(1.6);

        Transmission transmissionSedan = new Transmission();
        transmissionSedan.setType("Mechanical");

        Wheel[] tiresTypeSedan;
        {
            tiresTypeSedan = new Wheel[4];
            tiresTypeSedan[0].setTiresType(new String[]{"TOYO"});
            tiresTypeSedan[1].setTiresType("TOYO");
            tiresTypeSedan[2].setTiresType("TOYO");
            tiresTypeSedan[3].setTiresType("TOYO");
        }

        sedan.PrintInfoCar(engineSedan, transmissionSedan);
    }
}
