package jan27;

public class Test {

    // methods - set of block of statements

    // acces modifier
    // void - nothing will be returned
    // switchOnTv - name of method
    public String switchOnTv(){
        System.out.println("Turning on the TV");
        return "Hello";
    }

    public String yourName(){

        return "Arman";
    }


    // constructor
    // used to initilize the object
    // default constructor
    Test(){

    }

    // parameterized constructor

    public static void main(String[] args) {
        Test test = new Test();
        test.switchOnTv();
        System.out.println(test.yourName());
    }

}
