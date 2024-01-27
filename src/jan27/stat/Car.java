package jan27.stat;

public class Car {

    // static method
    public static void printCarDetails(){
        System.out.println("Car details ");
    }

    // static block
    static {
        System.out.println("Inside the static block");
    }

    // non static method
    public void run(){
        System.out.println("run method called ");
    }
// instance block
    {
        System.out.println("Instance block ");
    }

}
