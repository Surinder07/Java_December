package feb3.methodst;

public class StringTest {
    public static void main(String[] args) {

        String name = "pragra Incorp";
        System.out.println(name);

       /* String concat = name.concat(" Inc");
        System.out.println(concat);
        6 5 7 4 8 6


        int length = name.length();
        System.out.println(length);

        char c = name.charAt(2);
        System.out.println(c);

        String upperCaseString = name.toUpperCase();
        System.out.println(upperCaseString);

        System.out.println(name.isEmpty());*/

        String removedSpaces = name.trim();
        System.out.println(removedSpaces);

        String substring = name.substring(3, 8);
        System.out.println(substring);

        boolean p = name.contains("p");
        System.out.println(p);

        // 10 - 15 minutes



    }
}
