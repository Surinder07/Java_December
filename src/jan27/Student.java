package jan27;

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
    }
}


//stack --------> Heap
