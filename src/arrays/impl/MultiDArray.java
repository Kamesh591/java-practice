package arrays.impl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDArray {

    public static void main(String[] args) {
        int[][] multiarray= new int[2][3];
        multiarray[0][0]=10;
        multiarray[0][1]=15;
        multiarray[0][2]=5;
        multiarray[1][0]=20;
        multiarray[1][1]=20;
        multiarray[1][2]=20;

        System.out.println(Arrays.deepToString(multiarray));
        //Arrays.sort(multiarray,new ColumnComparator(1,SortingOrder.DESCENDING));

        System.out.println(Arrays.toString(multiarray));

    }
}
