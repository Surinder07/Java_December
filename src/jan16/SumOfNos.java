package jan16;

public class SumOfNos {
    public static void main(String[] args) {

        int x = 1;
       // counter ++;   ---> counter + 1
        int sum = 0;

        while (x <= 10){
           // System.out.println(x);
           // sum = sum + x;
            sum += x;  // shorthand for sum = sum + x;
            x ++;
        }
        System.out.println(sum);
    }
}
