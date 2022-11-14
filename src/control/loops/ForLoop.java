package control.loops;

public class ForLoop {

    public static void main(String[] args) {
       /* for(int i=0;i<10;i++){
            System.out.println("The iterated value of i is "+i);
        }*/

     /* for (int j=10;j>=0;j--){
            System.out.println("The iterated value of j is "+j);
        }*/

        int j=20;
        int k1=++j;

       /* //Pre decrement for loop
        for (int k=10;k>0;--k){
            System.out.println("The iterated value of j is "+k);
        }
*/
        /*for (int age=0;age<=20;age+=2){ //age=age+2
            System.out.println("Age of the person is"+age);
        }*/
        // 0 2 4 6  8 --- 18 20

        for (int age=0;;age++){
            System.out.println(age);
        }
    }
}
