package jan20;

public class CalculatorDemo {

    public int sub(int num1, int num2){
        return num1 + num2;
    }

    public int sum(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    public int sum(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {

        CalculatorDemo cal = new CalculatorDemo();

        int sumOfThreeNumbers = cal.sum(10, 20, 30);
        int sumOfFourNumbers = cal.sum(10, 20, 30, 40);

        //System.out.println("Sum of two numbers " + sumOfTwoNumbers);
        System.out.println("Sum of three numbers " + sumOfThreeNumbers);
        System.out.println("Sum of four numbers " + sumOfFourNumbers);
    }


}
/*


Method overloading:

a method with same name but different parameters


create a calculator
1. sum , of two numbers, 3, 4
1. div /sub/ multiplication/ modulus

switch case
// use methods
// do while


 */