package mar2.stacknqueue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        Queue<Integer> queue = new ArrayDeque<>();
        Queue<Integer> q2 = new PriorityQueue<>();


//        Integer peek = queue.element();
//        System.out.println(peek);

        queue.offer(10);
        queue.offer(10);
        queue.offer(10);
        System.out.println(queue);



    }
}
