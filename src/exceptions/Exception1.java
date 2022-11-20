package exceptions;

public class Exception1 {

    public static int m1(){
        try{
            return 5+4;
        }
        catch (Exception e){
            return 2+3;
        }
        finally {
            return 4+4;
        }
    }

    public static void main(String[] args) {
        System.out.println(m1());

    }
}
