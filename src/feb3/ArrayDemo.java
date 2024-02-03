package feb3;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        // how to create array , integer array before
        //char[] ch = {'P','R','A','G','R','A'};
        char[] ch = new char[6]; // decalration of array

        System.out.println("Enter the your character ");
        for (int i = 0; i < ch.length ; i++) {
           ch[i] = scanner.next().charAt(1);
        }

        // print this array ?
        for (char e : ch) {
            System.out.print(e);
        }
    }
}
// String --- > what is string?