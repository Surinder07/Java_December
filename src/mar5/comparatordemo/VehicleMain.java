package mar5.comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class VehicleMain {
    public static void main(String[] args) {

        List<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(new Vehicle("Audi", 2022));
        vehicleList.add(new Vehicle("Audi", 2020));
        vehicleList.add(new Vehicle("Ford", 2019));
        vehicleList.add(new Vehicle("BMW", 2024));
        vehicleList.add(new Vehicle("Honda", 2018));
       Collections.sort(vehicleList, new BrandComparator());


        Comparator<Vehicle> vehicleComparator = Comparator.comparing(Vehicle::getBrand)
                                                          .thenComparingInt(Vehicle::getMakeYear);



        Collections.sort(vehicleList, vehicleComparator);
        System.out.println(vehicleList);

        // ConcurrentHashMap
       // CopyOnWriteArrayList
      //  CopyOnWriteArraySet




    }
}
