package jan27.arraydemo;

import java.util.Scanner;

public class DemoTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your values : ");

        int[] arr = new int[5];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }
       /* arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;*/

        for (int i = 0; i < arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
}

// 10 mins
// create an array of Fruits - 5
// take user input
// print those on the console