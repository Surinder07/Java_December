package feb3;

public class StringDemo {
    public static void main(String[] args) {

        // Literal
        String name = "pragra";   //  String Constant pool
        System.out.println(name);


        // by using new keyword
        String address = new String("Mississauaga");  //  non SCP
        System.out.println(address);


        String s1 = "Charger";
        s1 = "Phone";
        System.out.println(s1);
    }
}
