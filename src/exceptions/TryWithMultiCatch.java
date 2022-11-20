package exceptions;

import java.io.FileNotFoundException;

public class TryWithMultiCatch {

    public static void main(String[] args) {


        try{
            System.out.println(10/0);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("This is default Exception");
        }
    }
}
