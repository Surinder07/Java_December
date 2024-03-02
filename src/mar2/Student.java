package mar2;

public final class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
class MainTest{
    public static void main(String[] args) {

        Student student = new Student(101, "test");
        System.out.println(student);

    }
}

/*
You can not change or set new values
cannot override


 */