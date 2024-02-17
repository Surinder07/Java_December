package feb17.annoymousdemo;

public class DellLaptop {
    public static void main(String[] args) {

        // we can not create object of abstract class , interface
        //Computer computer = new Computer();

        /*Laptop laptop = new Laptop();
        laptop.calculate();*/

        Computer computer = new Computer() {
            @Override
            public void calculate() {
                System.out.println("Calcualting...");
            }

            @Override
            public void surfIn() {
                System.out.println("Child class");
            }
        };
        computer.calculate();
        computer.surfIn();

    }
}
