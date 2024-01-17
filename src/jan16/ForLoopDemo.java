package jan16;

public class ForLoopDemo {
    public static void main(String[] args) {

       /* // init        condition      increment/decrement
        for(int i = 1 ; i <= 100 ; i ++){
            if( i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }*/


        // init        condition      increment/decrement
        for(int i = 1 ; i <= 100 ; i ++){
            if( i == 56) {
                break;
            }
            System.out.println(i);
        }
    }
}
/*
Lottery system :
User input -- use a scanner , 100
Enter the number : 4, 7,

1.whenever you encounter a multiple of 7 print : you got 7 points
2. whenever you encounter multiple of 5 : 5 points

if user enter number  6 : You wont 100M lottery and exit




continue ;  skip the current iteration
break; it breaks the loop

print the numbers
using for loop
1. multiplication table of 2
2. factorial




1. init
2. condition
3. increment
4. print the statement

1. init
2. condition
3. print the statement
4. increment/decrement





   for(initialization ; condition ; increment/decrement){

        // statement
   }

 */