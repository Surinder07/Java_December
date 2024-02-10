package feb10.encap;

public class EncapsulationDemo {
    public static void main(String[] args) {

        Student student = new Student(101, "Peter");
        Student student2 = new Student(102, "Peter");


        // setting the values
        student.setId(201);
        student.setName("Aleesha");

        // getting the values
        System.out.println(student.getId());
        System.out.println(student.getName());

        student.printStudentDetails();




    }
}
