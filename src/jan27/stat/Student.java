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
