package feb20;

public class ChainingExceptinDemo {
    public static void main(String[] args) {
        a1();

    }


    public static void a1(){
        try {
            a2();
        } catch (NullPointerException e) {
            throw new RuntimeException(e);
        }
    }


    public static void a2() throws NullPointerException{
        a3();
    }

    public static void a3() throws NullPointerException{

        String s = null;
        String upperCaseString = s.toUpperCase();
        System.out.println("UpperCase String " + upperCaseString);
    }

}
