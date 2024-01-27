package jan27.stat;

public class CarDemo {
    public static void main(String[] args) {

        // Object
        /*Car car = new Car("Hyundai", 2000.00);
        car.printCarDetails();*/

        // call static methods with the name of the Class
        // Object is not required to call methods in the class

        //Car car = new Car();
       // car.run();
        Car car = new Car();
        car.run();
        Car.printCarDetails();


    }
}
// JVM --------------------> main()

/*

static context
non static context
 */