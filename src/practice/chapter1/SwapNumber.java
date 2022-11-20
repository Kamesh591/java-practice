package practice.chapter1;

public class SwapNumber {

    public static void main(String[] args) {
        int i=20;
        int j=30;

        i+=j;
        j=i-j;
        i=i-j;

        System.out.println("Value of i after swapping is:"+i);
        System.out.println("Value of j after swapping is:"+j);
    }
}
