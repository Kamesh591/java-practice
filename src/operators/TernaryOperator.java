package operators;

public class TernaryOperator {

    public static void main(String[] args) {

        // syntax value= Expression ? value1 : value2
        int x=10;
        int y=20;

        int actualValue=(x<y)? x : y;
        System.out.println(actualValue);

        int anothervalue=(x>y)?x:y;
        System.out.println(anothervalue);
    }
}
