package operators;

public class LogicalOperator {

    public static void main(String[] args) {
        //Allowed logical operators are AND(&&), OR (||) and NOT(!)
        int a = 10, b = 20, c = 20, d = 0;
        if ((a < b) && (b == c)) {
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        else
            System.out.println("False conditions");
    }
}

