package jan27;

import java.util.logging.Logger;

public class Student {
    int id;
    String name;

    public String whatIsYourName(String name1){
        return "Hello "+name1;
    }


    public static void main(String[] args) {

        Student student = new Student(); // arguments
        String greeting = student.whatIsYourName("Arman");
        System.out.println(greeting);

        Logger logger = Logger.getAnonymousLogger();
        logger.info(() -> "Hello");
        throw new IllegalArgumentException("Test");

    }
}


//stack --------> Heap
