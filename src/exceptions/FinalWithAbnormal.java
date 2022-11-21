package exceptions;

public class FinalWithAbnormal {

    public static void main(String[] args) {

        try
        {
            System.out.println(10/0);
        }
        catch (NullPointerException e){
            System.out.println("This is dummy exception block");
        }
        finally {
            System.out.println("Finally Block gets options");
        }
    }
}
