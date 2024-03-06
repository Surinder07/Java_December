package mar5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student(103, "Peter"));
        student.add(new Student(101, "Parker"));
        student.add(new Student(101, "Smith"));
        student.add(new Student(105, "John"));

        Collections.sort(student);
        System.out.println(student);


        //  compare the strings
    }
}
class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {
        return this.id - student.id;
        // 103 - 101 , postive
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
