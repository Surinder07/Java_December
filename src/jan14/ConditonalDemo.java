package jan14;

import java.util.Scanner;

public class ConditonalDemo {
    public static void main(String[] args) {

        System.out.println("*** Welcome to my voting machine ***");
        Scanner sc = new Scanner(System.in);





        System.out.println("Enter the age ");
        int age = sc.nextInt(); // age = 12


       //

        if(age < 13){
            System.out.println("infant");
        }
        else if(age <= 19){
            System.out.println("Teenager");
        }
        else if(age <= 40){
            System.out.println("Adult");
        }
        else {
            System.out.println("Not a human");
        }
    }
}
/*
  age - less than 13 -- infant
  13- 19 -- teenager
  19-60 ---- Adult
  more than 60 -- Senior citizen
  other not a human

// 3 numbers
num1 = 5
num2 =  10
num3 = 15
compare 3 numbers and find the greatest number

 */
