package jan30;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of array");
        char[] arr = {'a','b','c'};

        int[] num;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("Print the elements in the array");

        /*for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);;
        }*/

        // for each loop
        // for every element of integer type in this array - arr
        for (int element : arr) {
            System.out.println(element);
        }

// reverse an array
        //  max from this ?
        // arr = 12  4 1M
// insertion in array - costly operation
        // read - easy    O(1)

        //Collections

        // int big = 0;

        /*big = arr[0];
            12  -  0
            12    --- 4
            12 ---- 45

            big = 45

            /*
            time complexity
            Big O(1) - linear
            Big O(n) -

         */

        //find the largest/smallest element in array
//  write a method
//  number = 10,30,43,54,23,543,43,32
        // sum of all elements of array
        // for each to print array
    }
}






