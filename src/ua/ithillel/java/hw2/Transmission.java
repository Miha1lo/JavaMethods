package ua.ithillel.java.hw2;

public class Transmission {

    private String type;

    public void PrintInfoAboutTransmission (){
        System.out.println("Type of car transmission: " + type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
