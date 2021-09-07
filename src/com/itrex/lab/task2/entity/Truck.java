package com.itrex.lab.task2.entity;

public class Truck extends Car {
    public Truck(String brand, String model, int yearLaunched, int numberOfWheels, int weight) {
        super(brand, model, yearLaunched, numberOfWheels, weight);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearLaunched=" + yearLaunched +
                ", numberOfWheels=" + numberOfWheels +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;

        Truck car = (Truck) o;

        if (yearLaunched != car.yearLaunched) return false;
        if (numberOfWheels != car.numberOfWheels) return false;
        if (weight != car.weight) return false;
        if (brand != null ? !brand.equals(car.brand) : car.brand != null) return false;
        return model != null ? model.equals(car.model) : car.model == null;
    }
}
