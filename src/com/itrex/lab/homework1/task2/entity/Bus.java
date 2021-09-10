package com.itrex.lab.homework1.task2.entity;

import java.util.Objects;

public final class Bus extends Car {

    public Bus(String brand, String model, int yearLaunched, int numberOfWheels, int weight) {
        super(brand, model, yearLaunched, numberOfWheels, weight);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;

        Bus car = (Bus) o;

        if (yearLaunched != car.yearLaunched) return false;
        if (numberOfWheels != car.numberOfWheels) return false;
        if (weight != car.weight) return false;
        if (!Objects.equals(brand, car.brand)) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearLaunched=" + yearLaunched +
                ", numberOfWheels=" + numberOfWheels +
                ", weight=" + weight +
                '}';
    }
}
