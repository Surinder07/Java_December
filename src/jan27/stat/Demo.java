package jan27.stat;

public class Demo {

    public void show(){
        System.out.println("Non static method"); //3
    }

    public static void test(){
        System.out.println("static method ");//4
    }
    static{
        System.out.println("Print in static block"); //1
    }
    {
        System.out.println("Inside the instance block"); //2
    }
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.show();
        Demo.test();
    }
}
