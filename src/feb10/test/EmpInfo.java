package feb10.test;

import feb6.oops.A;

public class EmpInfo {
    public static void main(String[] args) {

       // Address address = new Address("110 Matheson","Mississauga","CA","L2K 4W3");
        Employee dinesh = new Employee(101, "Dinesh",new Address("110 Matheson","Mississauga","CA","L2K 4W3"));

        System.out.println(dinesh.address.city);



    }
}
/*
Student --- Address

 */