package com.vehicles;

import com.details.Engine;
import com.professions.Driver;

public class SportCar extends Car {

    protected double maxSpeed;

    public SportCar(String theMakeOfCar, String carClass, int weight, double maxSpeed) {
        super(theMakeOfCar, carClass, weight);
        this.maxSpeed = maxSpeed;
    }

    Driver driver = new Driver("17.08.1999", "Julia Swift", 5);
    Engine engine = new Engine(1200, "Super pilot");

    @Override
    public String toString() {
        return "SportCar{" +
                "theMakeOfCar='" + theMakeOfCar + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
