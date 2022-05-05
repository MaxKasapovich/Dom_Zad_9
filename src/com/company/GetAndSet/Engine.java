package com.company.GetAndSet;

public class Engine {

    private String type;
    private int cylinderNum;
    private double engineCapacity;
    private String engineRow;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCylinderNum() {
        return cylinderNum;
    }

    public void setCylinderNum(int cylinderNum) {
        this.cylinderNum = cylinderNum;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getEngineRow() {
        return engineRow;
    }

    public void setEngineRow(String engineRow) {
        this.engineRow = engineRow;
    }

    public void engineSpecs() {
        System.out.println("\nEngine info:");
        System.out.println("Type: " + getType());
        System.out.println("Number of cylinders: " + getCylinderNum());
        System.out.println("Engine Capacity: " + getEngineCapacity());
        System.out.println("Engine row: " + getEngineRow());
    }
}
