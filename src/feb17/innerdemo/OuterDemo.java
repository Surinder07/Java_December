package feb17.innerdemo;

// static Inner class
public class OuterDemo {


    static class InnerDemo{

        public void test(){
            System.out.println("Inside test method...");
        }
    }

    public static void main(String[] args) {

        OuterDemo.InnerDemo obj = new OuterDemo.InnerDemo();
        obj.test();

    }
}
