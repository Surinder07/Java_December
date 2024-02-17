package feb17.protect.child;

import feb17.protect.parent.Parent;

public class Child extends Parent{

    String childName;

    void showChildDetails(){
        System.out.println("Child class");
    }

    public static void main(String[] args) {
       Child child = new Child();
       child.showChildDetails();

       child.showParent();


    }
}
