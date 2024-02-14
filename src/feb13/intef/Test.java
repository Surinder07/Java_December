package feb13.intef;


interface A{

    // variables -
    // public static final by default

    int x = 100;

    // methods
    // public abstract by default

    void test();
    void show();


}
class B implements A{

    @Override
    public void test() {
        System.out.println("Test");
    }

    @Override
    public void show() {
        System.out.println("Show");
    }
}

public class Test {
    public static void main(String[] args) {
        B b  = new B();
        b.show();
        b.test();
    }
}


/*
extends      implements

Class       interface      interface
|               |           |
Class       Class           extends


 */