package exceptions;

public class FinallyWithSystemExit {

    public static void main(String[] args) {

        try
        {
            System.out.println("Try block");
            System.exit(0);
        }
        catch (NullPointerException e){
            System.out.println("This is dummy exception block");
        }
        finally {
            System.out.println("Finally Block gets options");
        }
    }
}
