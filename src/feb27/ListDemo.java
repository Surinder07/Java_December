package feb27;

import feb27.employee.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(180);


        Collections.sort(list);
        System.out.println(list);




    }
}  // size = 6
    // 5 - 0   -  n
//   0  10 20 30 40 50 60
//   0  1  2  3  4  5  6

// O(1) - contant time
// O(n) - Linear time
/*


elements are stored in an order
duplicates are allowed

Time complexity and space complexity
 */
