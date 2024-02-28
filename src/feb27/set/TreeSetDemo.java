package feb27.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        System.out.println("HashSet - no order");
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(20);
        hashSet.add(0);
        System.out.println(hashSet);

        System.out.println("TreeSet - ascending order");

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(20);
        treeSet.add(0);
        System.out.println(treeSet);

        System.out.println("Linked HashSet -  insertion order ");
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(20);
        linkedHashSet.add(0);
        System.out.println(linkedHashSet);


    }
}

/*


Does not allow duplicates
elements are stored in ascending order

 */