package control.stmt;

public class EvenOdd {

    public static void main(String[] args) {
        int x = 20;


// for Multiline commenting & Uncommenting in Intellij , pls use Ctrl + Shift + /
        if ( (x % 2)== 0)
        {
            System.out.println("It's EVen number");
        }
       int y = 21;
        if ((y % 2) == 0) {
            System.out.println(y + "\tis an even number");
        } else {
            System.out.println(y + "\tis an odd number");
        }
        int age = 18;
        if (age <= 4) {
            System.out.println("Customer is Infant");
        } else if (age <= 15) {
            System.out.println("Customer is School student");

        } else if (age <= 20) {
            System.out.println("Customer is College stundent");

        } else {
            System.out.println("Customer is ready for job interviews");
        }

        if(age<=20){
            if(age%2==0){
                System.out.println("Even number");
            }
        }
    }
}
