package jan30;

public class TwoDArray {
    public static void main(String[] args) {
        int[] num = {32,43,23,54,654,345};
        System.out.println(num[0]);

        int[][] arr = new int[3][3]; // 3 x 3
        arr[0][0] = 10;
        arr[0][1] = 5;
        arr[0][2] = 20;


        arr[1][0] = 15;
        arr[1][1] = 30;
        arr[1][2] = 55;


        arr[2][0] = 21;
        arr[2][1] = 34;
        arr[2][2] = 23;


        System.out.println(arr[0][0]); // 10
        System.out.println(arr[2][0]);// 21
        System.out.println(arr[1][1]);// 30
        System.out.println(arr[1][2]); //  55
// for every element of integer type in this array - arr
        //  int[][] arr = new int[3][3];
        System.out.println("+++++++");
        for (int[] element : arr) {
            for (int numbers : element){
                System.out.println(numbers);
            }
        }

/*

10 mins.

3 x 2 array


 */





       /* int[] internalArray = arr[0];
        int i = internalArray[0];*/

//        System.out.println(internalArray[0]);

        //arr[0]


    }
}














