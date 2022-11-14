package control.loops;

public class DoWhileImpl {

    public static void main(String[] args) {

        String firstName="Kamesh";
        String surname="Gandru";
        String fullname=firstName+surname;
        int num1=20;
        int num2=30;
        int sum=num1+num2;

        System.out.println(fullname);
        System.out.println(sum);
        int i=1;
        do {

            System.out.println("The value of i is "+i);
            i--;
        }while (i>=0);

    }
}
