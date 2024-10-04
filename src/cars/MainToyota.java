package cars;

import cars.Toyota;

public class MainToyota {
    

    public static void main (String[] args){

        Toyota camry = new Toyota();

        camry.info();
        System.out.printf(">> has GPS %s.\n", camry.isGps());

        camry.fuelGauge();
        camry.go(5, true);
        camry.fuelGauge();
        camry.go(7,true);
        camry.fuelGauge();

        Car myCar = new Toyota();
        Fiat fiat = new Fiat();

        // Toyota toyota = new Car() cannot be done because parent and child is one-way
        // Toyota toyota = new BMW() also cannot be done because they are peers

        CarWorkshop workshop = new CarWorkshop();
        workshop.service(myCar);

        workshop.service(camry);
        workshop.service(fiat);

    }
}
