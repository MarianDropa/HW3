package org.cursor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(100, 150, true, true);
        car.CarCruiseSpeed();
        car.carSpeed();
        car.startEngine();
        car.stopEngine();
    }
}

class Car {
    int carSpeed = 100;
    int carCruiseSpeed = 150;
    boolean startEngine = false;
    boolean stopEngine = false;

    public Car(int carSpeed, int carCruiseSpeed, boolean startEngine, boolean stopEngine) {
        this.carSpeed = carSpeed;
        this.carCruiseSpeed = carCruiseSpeed;
        this.startEngine = startEngine;
        this.stopEngine = stopEngine;
    }

    public void CarCruiseSpeed() {
        System.out.println("Car is holding speed: " + carCruiseSpeed);
    }

    public void startEngine() {
        System.out.println("Engine is running");
    }

    public void stopEngine() {
        System.out.println("Engine is off");
    }

    public void carSpeed() {
        System.out.println("The car is moving at speed 100");
    }
}
