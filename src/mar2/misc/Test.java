package mar2.misc;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
 
        // Arrays

        // Collections class

        // Immutable list
       // List<Integer> list = List.of(12, 2, 342, 43, 43, 43, 43, 43, 34);

        List<Integer> list = new ArrayList<>();
        list.add(3430);
        list.add(54340);
        list.add(303);
        list.add(40343);
        list.add(4033);

        Collections.sort(list);
        System.out.println(list);

        Integer max = Collections.max(list);
        System.out.println(max);

        Integer min = Collections.min(list);
        System.out.println(min);

        Collections.emptyListIterator();


        List<Integer> list1 = Arrays.asList(12, 323, 23, 2, 32, 32, 32);
        Collections.sort(list1);

        // Java 8
        Set<Integer> collect = list1.stream().filter(x -> x > 31).collect(Collectors.toSet());
        System.out.println(collect);

        System.out.println(list1);



    }
}



/*
Tomorrow
wednesday : 8 pm - 10 PM */





