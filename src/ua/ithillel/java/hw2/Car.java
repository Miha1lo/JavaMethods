package ua.ithillel.java.hw2;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void PrintInfoCar(Engine engine, Transmission transmission, Wheel wheel) {
        System.out.println("Model of car: " + model);
        System.out.println("Car color: " + color);

        engine.printEngineInfo();

        transmission.PrintInfoAboutTransmission();

        wheel.printTiresType();

    }
}