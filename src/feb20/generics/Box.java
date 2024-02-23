package feb20.generics;

public class Box<T1, T2> {

    T1 item1;
    T2 item2;

    public Box(T1 item1, T2 item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public void printDetails(){
        System.out.println(item1);
        System.out.println(item2);
    }
}

class BoxGen{
    public static void main(String[] args) {
        Box<Boolean, Integer> box = new Box<>(true, 239);
        box.printDetails();

    }
}

// Generic ?
