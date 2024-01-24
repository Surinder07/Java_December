package jan23.staticdemo;

public class Employee {
    String id;
    String firstName;
    static String companyName = "Pragra"; // this is given memory once


    public Employee(String id, String firstName) {
        this.id = id;
        this.firstName = firstName;

    }

    public void display(){
        System.out.println(id);
        System.out.println(firstName);
        System.out.println(companyName);
        System.out.println();
    }
}
