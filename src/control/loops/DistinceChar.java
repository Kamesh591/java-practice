package control.loops;

import java.util.Arrays;

public class DistinceChar {

    public static void main(String[] args) {
        String name="RAGHURAMDAMDMADMUEURENFSDKADKAEUWUEWCKAS";
        char[] nameArray=name.toCharArray();
        System.out.println(Arrays.toString(nameArray));
        System.out.println(name.length());
        char[] uniqueArray= new char[nameArray.length];

        char[] duplicateArray= new char[nameArray.length];
        for (int i=0;i<nameArray.length;i++){
            if (nameArray[i]!=nameArray[i+1]){
                uniqueArray[i]=nameArray[i];
            }

           // System.out.println(nameArray[i]+"Character Available "+count +"times");
            System.out.println(Arrays.toString(uniqueArray));
        }
    }
}
