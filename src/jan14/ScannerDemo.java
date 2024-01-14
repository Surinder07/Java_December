package jan14;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        // we have to create this to take user input
        // create a scanner object
        // this class is outside of current package
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x :");
        //int x = 10;
        int x = scanner.nextInt(); // taking input from keyboard

        System.out.println("Enter the value of y :");
        // int y = 20;
        int y = scanner.nextInt(); // this input is coming from keyboard

        int sum = x + y;
        System.out.println("Sum of x and y  : "+ sum);

        // take two numbers num1, num2 and perform div of two numbers



    }
}
