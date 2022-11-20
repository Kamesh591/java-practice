package arrays.impl;

import java.util.Arrays;

public class ArraysSort {

    public static void main(String[] args) {

        int[] array = {4,2,1,3,5,9,6,8,7};   //{1,2,3,4,5,6,7,8,9}

        for(int i = 0 ; i < array.length;i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];  //temp=4
                    array[i] = array[j];// array[0]=2
                    array[j] = temp; //array[1]=4 //{2,4,1,3,5,9,6,8,7}
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
