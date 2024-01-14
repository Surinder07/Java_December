package jan14;

import java.util.Scanner;

public class SwitchCaseDemo {
    public static void main(String[] args) {

        System.out.println("*****Welcome to my calcualtor*****");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice ");
        int choice = scanner.nextInt();

        /*

        else if(  true  && false )
         */
        switch(choice){
            case 1:
                System.out.println("Addition");
                // add your addition login here
                break;
            case 2:
                System.out.println("Subtraction ");
                break;
            case 3 :
                System.out.println("Multiplication");
                break;
            case 4 :
                System.out.println("Division");
                break;
            case 5 :
                System.out.println("Modulus");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}

