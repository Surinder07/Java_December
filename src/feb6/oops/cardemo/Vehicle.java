package feb6.oops.cardemo;

public class Vehicle {

    String make;
    String color;
    String model;
    int year;


    public Vehicle(String make, String color, String model, int year) {
        this.make = make;
        this.color = color;
        this.model = model;
        this.year = year;
    }

    public void printDetails(){

        System.out.println(this.make);
        System.out.println("Company Name "+make);
        System.out.println("Color "+color);
        System.out.println("Year "+year);
        System.out.println("Model "+model);
    }

}
