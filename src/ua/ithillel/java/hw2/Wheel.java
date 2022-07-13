package ua.ithillel.java.hw2;

public class Wheel {
    private String tireType;
    private int radius;

    public Wheel(String tireType, int radius) {
        this.tireType = tireType;
        this.radius = radius;
    }

    public void printTiresType() {

        System.out.println("\t-Tire type: " + tireType);
        System.out.println("\t-Radius: " + radius);

    }
}

