package ua.ithillel.java.hw2;

public class Wheel {
    private String[] tiresType;

    public void printTiresType() {
        System.out.println("Name of tire manufacturer:");
        for (int i = 0; i < tiresType.length; i++) {
            System.out.println((i + 1) + " - " + tiresType[i]);
        }
    }

    public String[] getTiresType() {
        return tiresType;
    }

    public void setTiresType(String[] tiresType) {
        this.tiresType = tiresType;
    }
}

