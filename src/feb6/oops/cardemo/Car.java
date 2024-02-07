package feb6.oops.cardemo;

public class Car extends Vehicle{

    String bodyType;

    public Car(String make, String color, String model, int year, String bodyType) {
        super(make, color, model, year); // calls constructor of the super class
        this.bodyType = bodyType;
    }
    public void printCarDetails(){
        //printDetails(); // access methods
        System.out.println("Body type " + bodyType);
    }

}

//  class Phone  model, make call  --- Super
//  Smart Phone , model, color , surf internet  - Child
//  Class Samsung   , color, bodytype, usesAI-boolean , click pictures -- Child
// create object of Samsung class and print the details
// use super

/*
A
|
B
|
C

*/
