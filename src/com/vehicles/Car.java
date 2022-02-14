package com.vehicles;

import com.details.Engine;
import com.professions.Driver;

public class Car {

    protected String theMakeOfCar;
    protected String carClass;
    protected int weight;

    public Car(String theMakeOfCar, String carClass, int weight) {
        this.theMakeOfCar = theMakeOfCar;
        this.carClass = carClass;
        this.weight = weight;
    }

    Driver driver = new Driver("16.09.1987", "Mathew White", 10);
    Engine engine = new Engine(450, "General Motors");

    public void start() {
        System.out.println("Drive!");
    }

    public void stop() {
        System.out.println("Stop!");
    }

    public void turnRight() {
        System.out.println("Turn right!");
    }

    public void turnLeft() {
        System.out.println("Turn left!");
    }

    @Override
    public String toString() {
        return "Car{" +
                "theMakeOfCar='" + theMakeOfCar + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}

