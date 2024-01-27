package jan27.stat;

public class StudentMain {
    public static void main(String[] args) {

        // create student object
        Student student1 = new Student(101, "Rupinder", "Xyz");
        Student student2 = new Student(102, "Arman", "Xyz");
        Student student3 = new Student(103, "Dinesh", "Xyz");
        Student student4 = new Student(104, "Mustafa", "Xyz");
        Student student5 = new Student(105, "Aleesha", "Xyz");

        // calling printStudent method
        student1.printStudent();
        student2.printStudent();
        student3.printStudent();
        student4.printStudent();
        student5.printStudent();
    }
}


// 10 mins
// Family -- , firstName, lastName, age, HouseNumber;