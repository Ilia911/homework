package com.itrex.lab.task2;

/*Создать абстрактный класс Car, представляющий собой автомобиль.
        Добавить в него поля: марка, модель, год выпуска + несколько своих.
        Создать 4 класса, являющихся наследниками Car.
        Переопределить во всех 4-х классах методы equals(), hashCode() и toString()
        Создать класс Garage, хранящий в себе HashMap автомобилей,
        в котором ключом является объект автомобиля, значением - количество точно таких автомобилей в гараже.
        Добавить в класс Garage методы для парковки, выезда авто, а также для получения количества определенного
        вида автомобилей.
        Продемонстрировать работу гаража.*/

import com.itrex.lab.task2.entity.Car;
import com.itrex.lab.task2.entity.Garage;
import com.itrex.lab.task2.entity.PassengerCar;
import com.itrex.lab.task2.entity.SportCar;

public class Main {

    private static final Garage GARAGE = Helper.hardcodeGarage();
    private static final Car PASSENGER_CAR = new PassengerCar("Renault", "Espace", 2006, 4, 2005);

    public static void main(String[] args) {
        go();
    }

    private static void go() {

        System.out.println("Initial garage:");
        System.out.println(GARAGE + "\n");

        parkAdditionalCars();
        System.out.println("After parking two additional cars:");
        System.out.println(GARAGE + "\n");

        System.out.println("Total amount of " + PASSENGER_CAR + ":");
        System.out.println(GARAGE.calculateCurrentAmountOfSuchCars(PASSENGER_CAR) + "\n");

        System.out.println("Move out " + PASSENGER_CAR + ":");
        GARAGE.moveOut(PASSENGER_CAR);
        System.out.println("Amount of the " + PASSENGER_CAR + " after moving out:");
        System.out.println(GARAGE.calculateCurrentAmountOfSuchCars(PASSENGER_CAR));

    }

    private static void parkAdditionalCars() {

        // such cars has already exists in the garage.
        GARAGE.park(PASSENGER_CAR);

        // new car
        GARAGE.park(new SportCar("Mazda", "Mx-5", 2020, 2, 1200));
    }


}
