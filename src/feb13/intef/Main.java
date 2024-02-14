package feb13.intef;


interface Vehicle{

    void start();
    void stop();
    void accelerate();
}

class Car implements Vehicle{

    @Override
    public void start() {
        System.out.println("Car is running...");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped...");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
    }

    public boolean hasCarPlayFeature(){
        return true;
    }
}

class Truck implements Vehicle{
    @Override
    public void start() {
        System.out.println("Truck starts");
    }

    @Override
    public void stop() {
        System.out.println("truck stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerate");
    }
}

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.accelerate();
        car.stop();
        car.start();
        System.out.println("car play " +car.hasCarPlayFeature());

        System.out.println();

        Truck truck = new Truck();
        truck.accelerate();
        truck.stop();
        truck.start();

    }
}
