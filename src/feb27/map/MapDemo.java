package feb27.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        //  --- roll no  - Student Name

        Map<Integer, String> map = new TreeMap<>();
        map.put(101, "Dinesh");
        map.put(109, "Aleesha");
        map.put(103, "Shadrek");
        map.put(104, "Rupinder");
        map.put(105, "Haswanth");
        map.putIfAbsent(106, "Test");
        map.putIfAbsent(106, "Testing");


        // fetch
        // list.get
        // set.

        String s = map.get(101);

        System.out.println(map.getOrDefault(105, "No key found"));

        System.out.println(s);

        System.out.println(map);

    }
}

/*

Map - Key value pair
keys should be unique

TreeMap ? - sorted keys , natural order
LinkedHasMap

 */