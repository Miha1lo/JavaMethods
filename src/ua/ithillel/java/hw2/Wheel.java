package ua.ithillel.java.hw2;

public class Wheel {
    private String[] tiresType;

    public void printTiresType() {
        for (int i = 0; i < tiresType.length; i++) {
            System.out.println("Tire type " + (i + 1) + " wheel " + tiresType[i]);
        }
    }

    public String[] getTiresType() {
        return tiresType;
    }

    public Wheel setTiresType(String[] tiresType) {
        this.tiresType = tiresType;
    }
}

