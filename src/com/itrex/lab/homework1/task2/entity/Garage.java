package com.itrex.lab.homework1.task2.entity;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private String name;
    private final Map<Car, Integer> cars = new HashMap<>();

    private final static int MIN_AMOUNT_OF_CARS = 1;

    {
        name = "unknown";
    }

    public Garage() {
    }

    public Garage(String name) {
        this.name = name;
    }

    public void park(Car car) {

        if (cars.containsKey(car)) {
            int currentAmountOfCars = cars.get(car);
            cars.put(car, ++currentAmountOfCars);
        } else {
            cars.put(car, MIN_AMOUNT_OF_CARS);
        }
    }

    public boolean moveOut(Car car) {
        if (cars.containsKey(car)) {
            if (cars.get(car) == MIN_AMOUNT_OF_CARS) {
                cars.remove(car);
            } else {
                int currentAmountOfCars = cars.get(car);
                cars.put(car, --currentAmountOfCars);
            }
        } else {
            return false;
        }
        return true;
    }

    public int calculateCurrentAmountOfSuchCars(Car suchCar) {
        return cars.getOrDefault(suchCar, 0);
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder("Garage name = " + name + ", cars: \n");

        cars.entrySet().forEach(entry -> result.append(entry).append("\n"));

        return result.toString();
    }
}
