package jan20;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number ");
        int num1 = scanner.nextInt();

        System.out.println("Enter the first number ");
        int num2 = scanner.nextInt();
        // sum
        int totalSum = calculator.sum(num1, num2);// arguments
        System.out.println("Sum of "+ num1 + " and " + num2 + "  is  "+ totalSum);
        // div
        // multi
        // sub
    }

    public int sum(int a, int b){ // parameters
       // int sum = a + b;
        return a + b;
    }
}

// 10 mins , improvise the same calcualtor code
// utilize the methods in the switch case

// create a calculator , sum, div, sub, multiplication , with methods

//     do you still want to continue? Yes ,no exit


