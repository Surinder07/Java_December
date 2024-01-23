package jan20;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        // create object of car class
        Car honda = new Car();
        honda.fuelCap = 100;
        honda.manufacturer = "Honda";
        honda.topSpeed = 200;
        honda.totalSeats = 5;

        System.out.println("Print the variables ");
        System.out.println(honda.fuelCap);
        System.out.println(honda.manufacturer);
        System.out.println(honda.topSpeed);
        System.out.println(honda.totalSeats);

        // call these methods?
        System.out.println("Print the message");
        honda.park();
        honda.drive();
        honda.refuel();

    }
}
/*

create a class Student
variables 1. id, firstname, lastname, email
methods 2. study , sleep, eat

2. student objects
assign the values to variables and call their methods

 */

