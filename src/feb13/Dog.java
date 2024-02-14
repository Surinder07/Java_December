package feb13;

public class Dog extends Animal{

    @Override
    public void makeSound(){
        System.out.println("Dog barks...");
    }

    public void eating(){
        System.out.println("Dog is eating...");
    }
}
