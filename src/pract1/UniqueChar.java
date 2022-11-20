package pract1;

public class UniqueChar {

    public static void main(String[] args) {
        String fullString="ABCHDSEWHSDHS";
        char[] stringArray=fullString.toCharArray();
        char[] uniqueChar= new char[stringArray.length];
        uniqueChar[0]=stringArray[0];
                for(int i=0;i< stringArray.length;i++){
                    //if (Arrays.)
                    if (stringArray[i]!=stringArray[i+1]){
                        uniqueChar[i]=stringArray[i+1];
                    }
                }
    }
}
