package jan20;

import java.util.Scanner;

public class CalcDemo {
    public static void main(String[] args) {

        System.out.println("********************");
        System.out.println("1. Addition");
        System.out.println("2. subtraction");
        System.out.println("3. multiplication");
        System.out.println("4. div");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice :");

        int choice = scanner.nextInt();


        switch (choice){

            case 1:
                // perfom sum
                // method call
                System.out.println(sum(10, 20));
                System.out.println(sum(10, 20, 30));
                System.out.println("Hello sum");
                break;
            case 2:
                // perform sub
                break;

            default:
                System.err.println("Invalid output");
        }
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static int sum(int a, int b){
        return a + b;
    }

}
