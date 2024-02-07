package feb6.oops;

public class A {
    public void aMethod(){
        System.out.println("inside A class");
    }
}

class B extends A {
    public void bMethod(){
        System.out.println("inside B class");
    }
}

class C extends B{

}
