package operators;

public class UnaryOperator {

    public static void main(String[] args) {

        /*
        Allowed values are  x++ , ++x , x-- & --x
        There are 2 kinds of Unary operators
        pre & post
         */

        /*
        This is for Post Increment
         */
        int x=10;
        int increx=x++;
        System.out.println(increx);
        System.out.println(x);

        /*
        The below lines of code is for Preincrement
         */
        int num2=15;
        int newnum2=++num2;

        System.out.println(newnum2);
        System.out.println(num2);
        int y=20;
        System.out.println(++y);
        int z=15;
        System.out.println(z--);
        System.out.println(z);
        int a=0;
        System.out.println(--a);
    }
}
