package feb27.set;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(); // no arg const
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);

        // set.contains()

//        Set<Integer> set2 = new HashSet<>(10, .5f);

        set.add(null);
        set.add(null);
        System.out.println(set);


        // for foreach iterator

      //  print out the list with no duplicates
        List<Integer> list = List.of(10, 20, 434, 3434, 23, 53, 23, 20, 43, 55, 434, 3434);
        Set<Integer> set2 = new HashSet<>(list);


    }
}

// does not allow duplicates
// 1 null element
// order is not maintained
// internally backed by HashMap
