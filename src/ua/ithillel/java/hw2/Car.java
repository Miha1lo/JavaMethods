package ua.ithillel.java.hw2;

import java.util.Arrays;

public class Car {
    private String model;
    private String color;
    private Engine engine;
    private Transmission transmission;
    private Wheel[] wheels;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public void PrintInfoCar() {
        System.out.println("Model of car: " + model);
        System.out.println("Car color: " + color);
        engine.printEngineInfo();
        transmission.PrintInfoAboutTransmission();

        for (int i = 0; i < wheels.length; i++) {
            System.out.println("Tire №" + (i + 1) + " characteristics: ");
            wheels[i].printTiresType();
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheel[] wheels) {
        this.wheels = wheels;
    }
}