package arrays.impl;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MultiDArray {

    public static void main(String[] args) {
        int[][] multiarray= new int[3][4];
        multiarray[0][0]=10;
        multiarray[0][1]=15;
        multiarray[0][2]=5;
        multiarray[1][0]=20;
        multiarray[1][1]=20;
        multiarray[1][2]=20;

        for (int i=0;i<multiarray.length;i++){
            for (int j=0;j<multiarray[i].length;j++){
                System.out.println(multiarray[i][j]);
            }
        }
       /* int[][] multiarray2={{10,20,30},{20,30,40}};
        System.out.println(multiarray2.length);*/

      /*  System.out.println(Arrays.deepToString(multiarray));
        //Arrays.sort(multiarray,new ColumnComparator(1,SortingOrder.DESCENDING));

        System.out.println(Arrays.toString(multiarray));

        int[][] intArray = new int[10][20];
        System.out.println(intArray.length);

        System.out.println(args.length);
        int num1=Integer.parseInt(args[0]);
        System.out.println(num1);*/

        /*int num2=Integer.parseInt(args[1]);
        System.out.println(num2);*/

    }
}
