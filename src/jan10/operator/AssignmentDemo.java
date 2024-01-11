package jan10.operator;

public class AssignmentDemo {
    // starting point of execution
    public static void main(String[] args){
        //int x; // decalration
        int x = 20;
        int y = 10; // init

        int div = x/y;

        int temp;

        temp = x;  // temp = 20
        x = y;   // x = 10
        y = temp; // y = 20

        // concatenation operator, join a string and other type of data in SOP.
        System.out.println("X : "+x);
        System.out.println("Y : "+y);
        System.out.println(x +" : "+y);


        // compiler time or runtime
        // swap these numbers
        // [process]

        // x = 10
        // y = 20;

        // 5 mins
        //IDE : Integeration development environment

        //Test.java -------compiled------>  Test.class file (Bytecode)
    }
}
