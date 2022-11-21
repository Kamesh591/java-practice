package exceptions;

public class SampleProgramm {

    public static void m1() throws Exception {
        System.out.println("This is m1 method");
         m2();
        System.out.println("This is m1 execution completion");
    }
    public static void m2() throws Exception
    {
        System.out.println("This is M2 method");
        try{
            System.out.println(10/0);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        System.out.println("This is my M2 method execxuion cpmpletion");
    }

    public static void main(String[] args) throws Exception {
       /* System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("====="); // Some Exception happened
        System.out.println(10/0);
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");
        System.out.println("=====");*/

        System.out.println("I'm inside Main method and 1st method being called");
        m1();


        System.out.println("This is main method execution completion & Thread compeltion");


    }
}
