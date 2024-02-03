package feb3.methodst;

public class StringMethods {
    public static void main(String[] args) {

        Student student  = new Student(101, "Dinesh");
        System.out.println(student);
        // Object class , super class of all the classes

        // String name = "Pragra";
        // 1. Reverse this string

        String name = "Pragra";
        char[] chars = name.toCharArray();

        for (char newName: chars) {
            System.out.println(newName);
        }

        // p r a g r a
        // 0 1 2 3 4 5



    }
}
