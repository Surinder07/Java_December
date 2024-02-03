package feb3;

public class StringTest {
    public static void main(String[] args) {

        String s1 = "Phone"; // SCP
        String s2 = "Phone"; // SCP
        String s3 = "Phone"; // SCP
        String s4 = new String("Phone"); // normal object
        String s5 = "Phone";
        s1 = "Rupinder";
        s1 = "test";

// == compares the literal and ref
// .equals , compare the literal value

        //System.out.println(s1 == s2); //
        //System.out.println(s1 == s3); //
      // System.out.println(s2 == s3); //
       System.out.println(s2.equals(s4)); //
        System.out.println(s1 == s4);
//
        System.out.println(s1.equals(s2));  //
        System.out.println(s1.equals(s3));  //
        System.out.println(s1.equals(s4));  //





        // s1 -------------------> Phone

        //s1= "test";

        // s1 ------------------> test

        // compare two strings
        // == , .equals





    }
}

// Garbage collector , automatically, .gc()
//