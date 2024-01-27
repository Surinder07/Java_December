package jan27.stat;

public class Student {
   /* int x; // Declaration
    int y = 10; // inilization*/

    // this is instance variable/ global variable
    int id;
    String firstName;
    String lastName;
    static String companyName = "Pragra Inc";

    // initilize the object
    public Student(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void printStudent(){
        System.out.println("Student Details : " + id +"  "+firstName +" "+ lastName + " "+ companyName);
    }
}

// create a class , create a variable [int counter]
// create a method and increment the couxnter and print the counter
// create 4-5 objects and call this method