package mar2.stacknqueue;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {

        // Stack
        // Queue

        Stack<Integer> stack  = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

       Integer element = stack.pop();
      System.out.println(element); //
//        System.out.println(stack);
//
//        System.out.println(stack.peek());
//        //System.out.println(stack);

        int search = stack.search(10); // position of element
        System.out.println(search);


        boolean empty = stack.empty();

    }
}


// stack LIFO - Last In First Out



// Queue -- FIFO --