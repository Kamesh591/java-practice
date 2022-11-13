package arrays.impl;

import java.util.Arrays;

public class SingleDArray {

    public static void main(String[] args) {
        int[] x= new int[10];
        for (int i=0;i<x.length;i++){
            x[i]=i;
        }

        for (int i:x){
            System.out.println(i);
        }



        int[] array2={10,20,24,05,23,28,4,3,2};
       Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));


    }
}
