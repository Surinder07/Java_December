package mar5.comparatordemo;

import java.util.Comparator;

public class BrandComparator implements Comparator<Vehicle> {
    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        return o2.brand.compareTo(o1.brand);
    }
}
