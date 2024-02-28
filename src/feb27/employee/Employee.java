package feb27.employee;
//  employees with name, email, age, Country.
public class Employee {
    String name;
    String email;
    int age;
    String country;

    public Employee(String name, String email, int age, String country) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                '}';
    }
}
