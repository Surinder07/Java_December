package feb24;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {


        ArrayList<Integer> arrayList = new ArrayList<>();

        // add
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        System.out.println( "Before adding : "+arrayList);

        arrayList.add(2, 100);
        System.out.println("after adding : "+arrayList);

        // fetch from array list
        System.out.println(arrayList.get(3));

        boolean contains = arrayList.contains(10);
        System.out.println(contains);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1000);

        arrayList2.addAll(0, arrayList);
        System.out.println(arrayList2);

        // check size of arraylist
        int size = arrayList.size();
        System.out.println("size of array list1  : " + size);

        //set
        arrayList.add(10, 201);
        System.out.println(arrayList);
        //  int  x = Integer.MAX_VALUE;

       // for loop ?

       /*
       create an Integer arraylist





       [1001,200,350,140,50,60, 232]
       1. find the maximum element from it
       2. swap two array elements  -- 200 ------232
        after swapping [1001,232,350,140,50,60, 200]

        int  max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for ....

        if(max <  i){
           max = i;
        }


        */




        }

    }
