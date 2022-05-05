package com.company.GetAndSet;

public class Wheels {

    private String brand;
    private String model;
    private int size;
    private double diameter;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public void wheelsSpecs() {
        System.out.println("\nWheels info:");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Wheel size: " + getSize());
        System.out.println("Wheel diameter " + getDiameter());
    }
}
