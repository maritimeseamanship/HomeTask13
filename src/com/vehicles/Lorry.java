package com.vehicles;

import com.details.Engine;
import com.professions.Driver;

public class Lorry extends Car {

    protected int carryingCapacity;

    public Lorry(String theMakeOfCar, String carClass, int weight, int carryingCapacity) {
        super(theMakeOfCar, carClass, weight);
        this.carryingCapacity = carryingCapacity;
    }

    Driver driver = new Driver("04.03.1975", "George Black", 20);
    Engine engine = new Engine(700, "Freight Monster");

    @Override
    public String toString() {
        return "Lorry{" +
                "theMakeOfCar='" + theMakeOfCar + '\'' +
                ", carClass='" + carClass + '\'' +
                ", weight=" + weight +
                ", carryingCapacity=" + carryingCapacity +
                ", driver=" + driver +
                ", engine=" + engine +
                '}';
    }
}
