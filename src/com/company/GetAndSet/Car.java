package com.company.GetAndSet;

public class Car {

    private String brand;
    private String model;
    private int year;
    private double price;
    private Engine engine;
    private Transmission transmission;
    private Wheels wheels;
    private Seats[] seats;

    public String getBrand() {
        return model;
    }

    public void setBrand(String model) {
        this.model = model;
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

    public Seats[] getSeats() {
        return seats;
    }

    public void setSeats(Seats seats) {
        this.seats = new Seats[5];
        for (int i = 0; i < this.seats.length; i++) {
            Seats = new Seats;
            this.seats[i] = seats;
            this.seats.setSeatsNum [i] = i + 1;

        }
        String interiorMaterial;
        int seatSize;

    }

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
    }
}
