package operators;

public class UnaryOperator {

    public static void main(String[] args) {

        /*
        Allowed values are  x++ , ++x , x-- & --x
        There are 2 kinds of Unary operators
        pre & post
         */

        int x=10;
        System.out.println(x++);
        System.out.println(x);
        int y=20;
        System.out.println(++y);
        int z=15;
        System.out.println(z--);
        int a=0;
        System.out.println(--a);
    }
}
