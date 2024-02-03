package feb3;

public class Test {
    public static void main(String[] args) {
        String s1 = "Phone"; // SCP
        String s2 = "Phone"; // SCP
        String s3 = "Phone"; // SCP
        String s4 = new String("Phone"); // normal object
        String s5 = "Phone";

        System.out.println(s1 == s5);

        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  // true
        System.out.println(s1.equals(s4));
    }
}
