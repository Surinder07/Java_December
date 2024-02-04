package feb3.methodst;

public class SwapTwoNos {
    public static void main(String[] args) {


        int x = 10;
        int y = 20;

        int temp;

        temp = x;  //          a[0]    = a[5-1]
        x = y;    //
        y = temp;
        //          0   1  2   3  4
        int[] arr = {10,20,30,40,50}; // length = 5,    length - 1

        /*
         int i = 0;
        int j = arr.length - 1;
        while (i < j) {    // 0  < 4
            int temp = arr[i];    // temp - 10
            arr[i] = arr[j];   //   j = 4,   arr[j] = 50,  arr[i]
            arr[j] = temp; //
            i++;
            j--;
        }


         */




    }
}
