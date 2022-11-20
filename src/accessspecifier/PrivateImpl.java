package accessspecifier;//package accessspecifier;

public class PrivateImpl {

    private static int x=10;

    private static void privatemethod(){
        System.out.println("The value of x is:"+x);
    }

    public static void main(String[] args) {

        privatemethod();
        System.out.println(x);

    }
}
