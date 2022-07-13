package ua.ithillel.java.hw2;

public class Transmission {

    private String type;
    private int year;

    public Transmission(String type, int year) {
        this.type = type;
        this.year = year;
    }

    public void PrintInfoAboutTransmission() {
        System.out.println("Transmission characteristics");
        System.out.println("\t-Type of car transmission: " + type);
        System.out.println("\t-Transmission year: " + year);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
