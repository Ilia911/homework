package com.itrex.lab.task2.entity;

import java.util.Objects;

public abstract class Car {

    protected final String brand;
    protected final String model;
    protected final int yearLaunched;
    protected final int numberOfWheels;
    protected final int weight;

    public Car(String brand, String model, int yearLaunched, int numberOfWheels, int weight) {
        this.brand = brand;
        this.model = model;
        this.yearLaunched = yearLaunched;
        this.numberOfWheels = numberOfWheels;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearLaunched() {
        return yearLaunched;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;

        Car car = (Car) o;

        if (yearLaunched != car.yearLaunched) return false;
        if (numberOfWheels != car.numberOfWheels) return false;
        if (weight != car.weight) return false;
        if (!Objects.equals(brand, car.brand)) return false;
        return Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + yearLaunched;
        result = 31 * result + numberOfWheels;
        result = 31 * result + weight;
        return result;
    }

    @Override
    public String toString() {
        return "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearLaunched=" + yearLaunched +
                ", numberOfWheels=" + numberOfWheels +
                ", weight=" + weight;
    }
}
