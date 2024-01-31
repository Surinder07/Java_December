package revision;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x ");
        int input = scanner.nextInt(); // 2


        switch (input){
            case 1:
                System.out.println("Inside the case 1 ");
                break;

            case 2:
                System.out.println("Inside case 2");
                break;

            case 3:
                System.out.println("inside case 3");
                break;
        }



    }
}

