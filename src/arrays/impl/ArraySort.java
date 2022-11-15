package arrays.impl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] sort={10,20,5,30,4,3,40};
        //{3,4,5,10,20,30,40}
        /*System.out.println(Arrays.toString(sort));
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));

        System.out.println("Max value of the array is:"+sort[sort.length-1]);
        System.out.println("The min value of the array is:"+sort[0]);*/
       // System.out.println(Arrays.binarySearch(sort,5));

        int max=sort[0];
        for (int i=1;i<sort.length;i++){
            if (max<sort[i]){
                max=sort[i];
            }
        }

        System.out.println(max);

        int min=sort[0];
        for (int i=1;i<sort.length;i++){
            if (min>sort[i]){
                min=sort[i];
            }
        }


        System.out.println(min);

    }
}
