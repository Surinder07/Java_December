package revision;

public class Car {
    // fields
    int topSpeed;
    String brand;

    // default
 /*   Car(){
        topSpeed = 100;
        brand = "Audi";
    }*/

    // parameterized
    // this = it refers the current class variables
    Car(int topSpeed, String brand){
        this.topSpeed = topSpeed;
        this.brand = brand;
    }
    public void printCarDetails(int topSpeed){
        System.out.println("Top speed from Car class "+this.topSpeed);
        System.out.println("Top speed from method call "+topSpeed);
        System.out.println(brand);
    }


    // methods - set of block of statements
    public void refuel(){
        System.out.println("refuelling");
    }

    public void park(){
        System.out.println("parking the car ");
    }



}
