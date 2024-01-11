package jan10.operator;

public class Test {
    public static void main(String[] args) {
         int x = 20;
         int y = 20;
         int z = 19;
                            //  true  &&   false  ---->    false
        System.out.println(x < y || x>z);  // true    , false

        System.out.println(x > y || x<y); // false
        System.out.println(x < y && y>z); // false
        System.out.println(x == y || x>z); // true
        System.out.println(x < y && x>=z); // false
        System.out.println(x <= y || x>z); // true
        System.out.println(x < y && x>=z); // false


         // ==, !, !=,   <,  >,  <=,   >=
      /*  System.out.println(x < y);
        System.out.println(x >y);
        System.out.println(x == y);

        System.out.println(x != y);*/
       // System.out.println(x >= y);

       // logical AND ( && ) , OR ( || ), NOT ( ! )

        // AND &&
        /*
        true     true     -----> true
        true     false     -----> false
        false    true     ------> false
        false    false    ------> false

        OR ||
        true     true     -----> true
        true     false     -----> true
        false    true     ------> true
        false    false    ------> false


        NOT !
        false ----> true
        true -----> false






         */

    }
}
// 5mins