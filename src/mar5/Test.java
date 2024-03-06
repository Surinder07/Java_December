package mar5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        Employee employee1 = new Employee(101, "Haswanth");
        Employee employee2 = new Employee(101, "Haswanth");

        Map<Employee, Double> map = new HashMap<>();

        map.put(employee1, 90000.00);
        map.put(employee2, 90000.00);

      //  Set<Map.Entry<Employee, Double>> entries = map.entrySet();

        for (Map.Entry<Employee, Double> entry: map.entrySet()) {
            System.out.println("Employee Id " + entry.getKey().empId);
            System.out.println("Employee Name " + entry.getKey().empName);
        }
    }
}
