package cars;

public class Car{

    // Mmembers of the class
    protected String make;
    protected String owner;
    protected String colour;
    protected int fuel =100;

    // Constructor takes the name of the class, DOES NOT have any written type like void (it makes it into a method)
    public Car(){
        this.colour= "silver";
        this.make = "Honda";
    }

    // Overloaded Constructor, cannot overload it to manipulate the return (public int go(){return })
    public Car(String m){
        this.make = m;
    }

    public Car(String m, String c){
        this.make = m;
        this.colour = c;
    }

    // Getters and Setters
    // Encapsulation
    public void setMake(String m){this.make = m;}
    public String getMake(){return this.make;}
    public void setOwner(String o){this.owner = o;}
    public String getOwner(){return this.owner;}
    public void setColour(String colour) {this.colour = colour;}
    public String getColour() {return colour;}


    // Methods - behaviours
    // Overloaded Method (Same name, diff param type)
    public void go(){
        this.go(1,false);
        // go(1,false)
        // this.fuel--;
    }

    public void go(int distance){
        this.go(distance, false);
        // go(distance, false)
        // this.fuel -= distance;
    }

    public void go (String distance){
        this.go(Integer.parseInt(distance), false);
    }

    public void go(int distance, boolean turbo){
        if (turbo){
            this.fuel -=2;
        }
        this.fuel -= distance;
    }

    public void accelerate(int acc){
        for (int i=0;i<acc;i++){
            go(i+1);
        }
    }

    public void fuelGauge(){
        System.out.printf("FUEL: %d\n", this.fuel);
    }
    
    public void info(){
        System.out.printf("Make: %s, Owner: %s, Colour: %s\n", this.make, this.owner, this.colour);
    }

}