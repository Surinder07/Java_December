package feb10.test;

public class Employee {
    int empId;
    String name;
    //String address;
    Address address;

    public Employee(int empId, String name, Address address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }

    public void printEmpDetails(){
        System.out.println(empId);
        System.out.println(name);
        System.out.println(address);

    }
}
