package revision;

import java.util.function.Predicate;

public class Loops {
    public static void main(String[] args) {
        int counter = 0;
       /* while (counter > 100) {
            System.out.println("Hello");
            counter ++;
        }*/

        do{
            System.out.println("Inside counter ");
            counter ++;
        }while (counter < 10);

        /*1.
        while(condition){
        // statement
        }

        2.
        do {
        // statement
        }while(condition);


         */


    }
}
