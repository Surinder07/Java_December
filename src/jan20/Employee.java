package jan20;

public class Employee {


    public void sleep(){
        work();      // this a method call
    }

    public void  work(){
        System.out.println("Working...");

    }

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.sleep();
    }
}
