package feb27.employee;

import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Peter", "Peter@gmail.com",25, "Canada"));
        list.add(new Employee("Mark", "mark@gmail.com",55, "US"));
        list.add(new Employee("Mike", "mike@gmail.com",15, "India"));
        list.add(new Employee("John", "john@gmail.com",45, "Mexico"));
        list.add(new Employee("smith", "smith@gmail.com",29, "Canada"));
        //Collections.sort();


        // Logic goes here
        // Find the employees with age over 30
        for (Employee e: list) {

            if(e.age > 30) {
                System.out.println(e.name);
            }
        }


        List<String> apples = List.of("Apples", "Oranges", "Banana");
        List<String> list1 = Arrays.asList("Apples", "Oranges", "Banana");

        // find all the employees who are from Canada
    }
}
