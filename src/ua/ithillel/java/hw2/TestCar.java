package ua.ithillel.java.hw2;

import java.util.Arrays;

public class TestCar {

    public static void main(String[] args) {

        Car sedan = new Car("Lancer IX EVO", "Black");

        Wheel wheel1 = new Wheel("TOYO", 16);
        Wheel wheel2 = new Wheel("TOYO", 16);
        Wheel wheel3 = new Wheel("TOYO", 16);
        Wheel wheel4 = new Wheel("TOYO", 16);
        Wheel[] wheels = {wheel1, wheel2, wheel3, wheel4};

        sedan.setEngine(new Engine(136, 2.0, 4));

        sedan.setTransmission(new Transmission("Mechanical", 2004));

        sedan.setWheels(wheels);

        sedan.PrintInfoCar();
    }
}