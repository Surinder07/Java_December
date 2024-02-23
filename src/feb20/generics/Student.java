package feb20.generics;

import java.time.format.SignStyle;

public class Student {
    Object name;
    Object course;

    public Student(Object name, Object course) {
        this.name = name;
        this.course = course;
    }

    public void printDetails(){
        System.out.println("Name :" + name);
        System.out.println("Course :" + course);
    }
}
class MainStudent{
    public static void main(String[] args) {
        Student student = new Student(3323 , 35.34);
        student.printDetails();
    }
}

/*


Wrapper class
primitive ---------> Wrapper class
int --- Integer
float --- Float
double -- Double

 */