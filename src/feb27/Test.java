package feb27;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        // iterate over the list
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(18);
        list.add(134);
/*
        // for loop
        for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        // for each
        for (Integer element : list) {
            System.out.println(element);
        }

        System.out.println();
        // Iterator
        Iterator<Integer> iterator = list.iterator();

        // hasNext() -- check if the element present
        // next() -- give me the element

         while (iterator.hasNext()){
             Integer next = iterator.next();
             System.out.println(next);
         }*/


        ListIterator<Integer>  listIterator = list.listIterator();

         while (listIterator.hasNext()){
             Integer nextElement = listIterator.next();
             System.out.println(nextElement);
         }

        System.out.println();

         while (listIterator.hasPrevious()){
             Integer previous = listIterator.previous();
             System.out.println(previous);
         }

// 1 2 3 4 5 6 7 7


        /*
        for loop
        for each
        Iterator
        forEach() - Java 8

         */


    }
}
