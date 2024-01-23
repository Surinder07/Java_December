package jan20;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {

        //Object of Greeting class
        Greeting greeting = new Greeting();

        //taking user input
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name ");*/

        String myName = "Surinder";

        // assigning the method return value to hello variable
        String hello = greeting.greet(myName);  // myname = "Surinder"
        System.out.println(hello);
    }

    public String greet(String name){  // name = "Surinder

        String myGreeting = "Hello" + name;   // Hello Surinder

        return myGreeting;
    }


    public String greet(String name, String language){  // name = "Surinder

        String myGreeting = "Hello" + name + ": spanish ";   // Hello Surinder

        return myGreeting;
    }


}
