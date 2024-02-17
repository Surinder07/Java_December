package feb17.excep;

import java.util.Scanner;

public class Student {
    public static void main(String[] args) {

        Scanner  scanner = new Scanner(System.in);

        String name = "Pragra";
        try{
            name = null;
            String upperCase = name.toUpperCase();
            System.out.println(upperCase);

            System.out.println("Hello");
        }

        catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {

            scanner.close();
            // to close the database connection
            // scanner , scanner.close()
            System.out.println("Inside finally block....");
        }


        System.out.println("After upper case ");

    }
}


/*

Tech manager [P1]


Senior dev


Intermediate dev


junior dev [P1]


 */


