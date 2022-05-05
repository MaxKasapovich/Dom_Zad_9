package com.company.GetAndSet;

public class Transmission {

        private String kind;
        private int gearsNum;
        private boolean sportMode;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getGearsNum() {
        return gearsNum;
    }

    public void setGearsNum(int gearsNum) {
        this.gearsNum = gearsNum;
    }

    public boolean isSportMode() {
        return sportMode;
    }

    public void setSportMode(boolean sportMode) {
        this.sportMode = sportMode;
    }

    public void transmissionSpecs() {
        System.out.println("\nTransmission info:");
        System.out.println("Transmission kind: " + getKind());
        System.out.println("Number of gears: " + getGearsNum());
        System.out.println("Sport mode: " + isSportMode());
    }
}
