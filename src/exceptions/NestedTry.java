package exceptions;

public class NestedTry {

    public static void main(String[] args) {

        try{
            System.out.println("Outer Tye block");
            try{

                System.out.println("Internal try block");
                System.out.println(10/0);
            }
            catch (NullPointerException nullPointerException){
                System.out.println("Internal catch block");
                nullPointerException.printStackTrace();
            }
            finally {
                System.out.println("This is final block of internal try block");
            }
            System.out.println("Outer Try block rest of the execution");
        }catch (Exception e){
            System.out.println("Outer catch block");
        }
        finally {
            System.out.println("Outer finally block");
        }
    }
}
