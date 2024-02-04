package feb3;

public class TestString {
    public static void main(String[] args) {
        String s = "test";
        String concat = s.concat(" method");

           //    s ----------->            test
        //       concat--------->          test method
       // System.out.println(s);
       // System.out.println(concat);

        // mutable Strings
        // StringBuffer and StringBuilder

        // thread safe   , 1.0
        StringBuffer sb = new StringBuffer("Pragra ");
        System.out.println(sb);
        sb.append("inc");

        // sb = "test";   // not possible

        // sb -------------> Pragra Inc
        //

        System.out.println(sb);

        // 1.5 , not thread safe ,
        StringBuilder sb2 = new StringBuilder("Laptop");
        sb2.append(" Mac");
        System.out.println(sb2);

        // cart 1 item- stoack
        // Amazon ----> shop ----> cart ----> payment ----> purchase [product-laptop]
        //

    }
}
