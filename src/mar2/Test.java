package mar2;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {

        //List Set
        // create hashmap

        List<Integer> list = new ArrayList<>();
        list.add(10);   // 10
        list.add(20);
        list.add(20);
        list.add(40);  // command + d

        HashSet<Integer> hashSet = new HashSet<>(list);
        System.out.println("hashset  : "+hashSet);

       // List<Set<Integer>> list1 = new ArrayList<>();


        for (Integer num:  list) {
            System.out.println(num);
        }


        Map<String, String> companies = new HashMap<>();
        companies.put("Microsoft", "Satyla Nadela"); // Entry
        companies.put("Google", "Sunder Pichai");
        companies.put("Salesforce", "Marc Benioff");
        companies.put("Meta", "Mark Zuckerberg");
        companies.put("Postman", "Abhinav Asthana");
        companies.put("Tesla", "Elon Musk");


        boolean tesla = companies.containsKey("Tesla");
        System.out.println(tesla);

        Set<String> companiesName = companies.keySet();
        System.out.println(companiesName);

        Collection<String> ceoNames = companies.values();
        System.out.println(ceoNames);

        // List<Integer> list = new ArrayList();
      /*  for (Integer i : list){
            System.out.println(i.get());
        }*/

        //Integer
        Set<Map.Entry<String, String>> entries = companies.entrySet();

       //  ["Microsoft", "Satyla Nadela", "Microsoft", "Satyla Nadela"]

        for ( Map.Entry<String, String> comp : entries) {

            System.out.println(comp.getKey());
            //System.out.println(comp.getValue());
        }

        // Immutable ? can not change

    }
}

/*
JSON
Name : "",
email : ""

Population of all countries

List ?
Canada - 100K
US - 200K
Mexico - 300K





 */
