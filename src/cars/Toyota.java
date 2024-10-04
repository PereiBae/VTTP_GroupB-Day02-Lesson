package cars;

// Derived Class (Inherits from the parent class)
public class Toyota extends Car {
    
    private boolean gps = false;
    
    public Toyota(){
        setMake("Toyota");
    }

    // Overriding
    // Method Signature is the same as the parent
    @Override //annotation
    public void go(int d, boolean t){
        this.fuel -= d;
    }

    @Override
    public void setMake(String m){
        this.make = "Toyota";
    }

    public boolean isGps() {return gps;}
    public void setGps(boolean gps) {this.gps = gps;}

}
