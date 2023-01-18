package it.develhope.encapsulation;

import java.util.Arrays;

public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    // creating getters and setter avoiding to use Lombok

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[]residentsNames) {
        this.residentsNames = residentsNames;
    }

    @Override
    public String toString() {
        return "House{" +
                "floorsNumber=" + floorsNumber +
                ", address='" + address + '\'' +
                ", residentsNames=" + Arrays.toString(residentsNames) +
                '}';
    }

}

