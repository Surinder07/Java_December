package mar2;

import java.util.HashMap;
import java.util.Map;

public final class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
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
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}


class MapDemo{

    // Java 7
    public static void main(String[] args) {
        // employee , salary
       Map<Employee, Integer> map = new HashMap<>(16, 0.75f);
        // 12

       Employee employee1 = new Employee(101, "Dinesh");
       Employee employee2 = new Employee(102, "Pushpender");
       Employee employee3 = new Employee(103, "Haswanth");
       Employee employee4 = new Employee(104, "Aleesha");
       Employee employee5 = new Employee(105, "Manoj");

       map.put(employee1, 1000 );
       map.put(employee2, 2000 );
       map.put(employee3, 3000 );
       map.put(employee4, 4000 );
       map.put(employee5, 5000 );


       System.out.println(map);




    }
}

/*

Immutable
Take a Product , prodid, ProdName

Map <Product, Price>
Product -- price

1. get all the products list  Set - Keys
2. get all the values  Collections - values
3. loop through the map and get the individual values and keys





 */