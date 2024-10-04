package cars;

public class CarWorkshop {
    
    public void service(Toyota toyota){
        System.out.printf("Servicing Toyota: %s\n", toyota.getMake());
    }

    public void service(Car car){
        if (car instanceof Fiat){
            System.out.printf("Servicing fiat: %s\n", car.getMake());
        }
        System.out.printf("Servicing Generic Car: %s\n", car.getMake());
    }

}
