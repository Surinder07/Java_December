package revision;

import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args){

        // user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x ");
        int x = scanner.nextInt();

        // even numbers ? ,
        // && - true/true , || , one is true, ! opposite

        if(x % 2 == 0  && x > 10){
            System.out.println(x + " is even number and greater than 10");
        }
        else if(x % 2 == 0  || x <= 10 ) {
            System.out.println("even and less than 10  ");
        }
        else{
            System.out.println("odd number");
        }

        /*if(x < 0){
            System.out.println("x is negative ");
        }
        else{
            System.out.println("x is positive ");
        }*/



        /*System.out.println("Enter the value for y ");
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println(sum);*/



    }
}
