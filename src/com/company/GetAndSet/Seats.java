package com.company.GetAndSet;

public class Seats {

    private int seatsNum;
    private String interiorMaterial;
    private int seatSize;

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
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

    public void seatsSpecs() {
        System.out.println("\nSeats info:");
        System.out.println("Number of seats: " + seatsNum()[0].getSeatsNum());
        System.out.println("Material of interior: " + seatsNum()[0].getInteriorMaterial());
        System.out.println("Material of interior: " + seatsNum()[0].getSeatSize());

    }
}
