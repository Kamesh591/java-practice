package arrays.impl;

public class SumOfNumbers {

    public static void main(String[] args) {
        int[]  variable={10,20,30,40,20,30,60};
        int sum=0;

        for(int localvar:variable){
            sum+=localvar;
        }
        int[] var2=new int[5];
        var2[4]=20;

        System.out.println("Sum of array is: "+sum);
        System.out.println(variable.length);
        //array index starts from 0 and ends at length-1

    }

}
