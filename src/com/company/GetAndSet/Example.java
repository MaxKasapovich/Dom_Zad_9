package com.company.GetAndSet;

public class Example {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setModel("Fiat");
        car1.setBrand("Bravo");
        car1.setYear(2009);
        car1.setPrice(3135.0);

        Seats seats = new Seats();
        seats.setInteriorMaterial("Leather");
        seats.setSeatSize(6);

        Engine engine = new Engine();
        engine.setType("Diesel");
        engine.setCylinderNum(12);
        engine.setEngineCapacity(1.6);
        engine.setEngineRow("V-shape");
        car1.setEngine(engine);

        Transmission transmission = new Transmission();
        transmission.setKind("Automatic");
        transmission.setGearsNum(6);
        transmission.setSportMode(false);
        car1.setTransmission(transmission);

        Wheels wheel = new Wheels();
        wheel.setBrand("Pirelli");
        wheel.setModel("GX666");
        wheel.setSize(17);
        wheel.setDiameter(68.0);
        car1.setWheels(wheel);

        public void printCarInfo() {
            carSpecs();
            engineSpecs();
            transmissionSpecs();
            wheelsSpecs();
        }
}
