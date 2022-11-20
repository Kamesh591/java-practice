package control.loops;

import java.util.Arrays;

public class DuplicateChar {

    public static void main(String[] args) {
        String name="RAGHURAMDAMDMADMUEURENFSDKADKAEUWUEWCKAS";
        char[] nameArray=name.toCharArray();
        System.out.println(Arrays.toString(nameArray));
        System.out.println(name.length());

        char[] duplicateArray= new char[nameArray.length];
        for (int i=0;i<nameArray.length;i++){
           int count=1;
            for (int j=0;j<nameArray.length;j++){
                if(nameArray[i]==nameArray[j]){
                    count++;
                }
            }
            System.out.println(nameArray[i]+"Character Available "+count +"times");
        }
    }
}
