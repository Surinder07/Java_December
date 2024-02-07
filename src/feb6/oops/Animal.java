package feb6.oops;

public class Animal {

    int x;
    public void eat(){
        System.out.println("animal sleeping");
    }
}

class Dog extends Animal{
   public void test(){
       System.out.println();
   }
}
class Main{
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
    }
}
