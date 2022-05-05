package com.company.GetAndSet;

public class Car {

    private String brand;
    private String model;
    private int year;
    private double price;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private int seatsNum[];
    private String interiorMaterial;
    private int seatSize;

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public Wheels getWheels() {
        return wheels;
    }

    public void setWheels(Wheels wheels) {
        this.wheels = wheels;
    }

    public int[] getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int[] seatsNum) {
        this.seatsNum = seatsNum;
    }

    public String getInteriorMaterial() {
        return interiorMaterial;
    }

    public void setInteriorMaterial(String interiorMaterial) {
        this.interiorMaterial = interiorMaterial;
    }

    public int getSeatSize() {
        return seatSize;
    }

    public void setSeatSize(int seatSize) {
        this.seatSize = seatSize;
    }

    public void seatsNum(Car seat) {
        seat = new Car[int[] getSeatsNum()];
        for (int i = 0; i < getSeatsNum(); i++) {
            Car seatsNum = new Car();
            seatsNum.setInteriorMaterial(getInteriorMaterial());
            seatsNum.setSeatSize(getSeatSize());
            seat[i] = seatsNum;
        }
    }

    public void carSpecs() {
        System.out.println("\nCar info:");
        System.out.println("Car brand: " + getBrand());
        System.out.println("Car model: " + getModel());
        System.out.println("Car year: " + getYear());
        System.out.println("Car price: " + getPrice());
        System.out.println("Number of seats: " + seatsNum()[0].getSeatsNum());
        System.out.println("Material of interior: " + seatsNum()[0].getInteriorMaterial());
        System.out.println("Material of interior: " + seatsNum()[0].SeatSize());

    }
}
