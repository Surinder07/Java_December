package feb3;

public class StringConcat {
    public static void main(String[] args) {

        // a + b ,
        int a = 5;
        int b = 10;
        int sum = a + b;  // + opeator will act as addition
       // System.out.println(sum);


        String s1 = "pragra ";
        String s2 = "company";
        String s3 = s1 + s2; // concatenation
        //System.out.println(s3);


//        System.out.println(s1 + s2 + 10); // pragra company 10
     // System.out.println(10 + s2 + 10); // 10company10
       // System.out.println( 10 + 20 + 30 + s1 ); //  30pragra , wrong
        System.out.println(s1 + 20 + 10); //  pragra30 , wrong
//        System.out.println(s2 + 20 + s1); // company20pragra

        // s120+10
        //s12030

        //System.out.println("Hello " + a +  " I am here " + b + " Test ") ;
        System.out.println("Sum : sduagdijsatgdiy atsdytsag " + (a+b));


        String concat = s1.concat(s2);
        System.out.println(concat);
    }
}
