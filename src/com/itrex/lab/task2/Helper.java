package com.itrex.lab.task2;

import com.itrex.lab.task2.entity.Bus;
import com.itrex.lab.task2.entity.Garage;
import com.itrex.lab.task2.entity.PassengerCar;
import com.itrex.lab.task2.entity.Truck;

public class Helper {

    public static Garage hardcodeGarage() {
        Garage garage = new Garage("Big garage");

        garage.park(new Bus("Renault", "Espace", 2006, 4, 2005));
        garage.park(new Bus("Renault", "Espace", 2006, 4, 2005));
        garage.park(new PassengerCar("Renault", "Espace", 2006, 4, 2005));
        garage.park(new Truck("MZKT", "Truck2021", 2021, 6, 10000));
        garage.park(new Truck("MZKT", "Truck2021", 2021, 6, 10000));
        garage.park(new Truck("MZKT", "Truck2021", 2021, 6, 10000));

        return garage;
    }
}
