package mar2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        //List Set
        // create hashmap

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
