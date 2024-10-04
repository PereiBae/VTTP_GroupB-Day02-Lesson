package cars;

import cars.Car;

public class Main {
    

    public static void main(String[] args){

        // Creting an instance of the class
        // Instantiation
        // myCar is an instance of Car
        Car myCar = new Car("Toyota");
        myCar.setOwner("Fred");
        myCar.info();

        Car yourCar = new Car("Nissan","Red");
        yourCar.setOwner("Barney");
        yourCar.info();

        Car ourCar = new Car();
        ourCar.setMake("BMW");
        ourCar.setOwner("Wilma");
        ourCar.info();

        Car batCar = new Car();
        batCar.setOwner("Bruce Wayne");
        batCar.info();

        batCar.fuelGauge();
        batCar.go();
        batCar.fuelGauge();
        batCar.go(3, true);
        batCar.fuelGauge();

        //car trailer for 6 cars
        Car[] trailer = new Car[6];
        trailer[0]= myCar;
        
    }

}
