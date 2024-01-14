package jan14;

import java.util.Scanner;

public class ScannerDiv {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for x :");
        double x = scanner.nextDouble();

        System.out.println("Enter the value for x :");
        double y = scanner.nextDouble();

        double div = x / y;
        System.out.println(div);

    }
}
