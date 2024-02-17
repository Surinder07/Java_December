package feb17.innerdemo;

public class OuterClass {
    private int x;
    public void outerClassMethod(){
        System.out.println("Outer class method");
    }


    class InnerClass{

        public void innerClassMethod(){
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args) {
        // Object of Outer class
        OuterClass outerObject = new OuterClass();

        // with the help of Outer object, we can create inner class object
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.innerClassMethod();

    }

}