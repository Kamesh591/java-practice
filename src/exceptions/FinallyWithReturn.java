package exceptions;

public class FinallyWithReturn {

    public static void main(String[] args) {

        try
        {
            System.out.println("Try block");
            return;
        }
        catch (NullPointerException e){
            System.out.println("This is dummy exception block");
        }
        finally {
            System.out.println("Finally Block gets options");
        }
    }
}
