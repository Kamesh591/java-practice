package exceptions;

public class ArthemeticException3 {

    public static void main(String[] args) {

        doStuff();
        System.out.println(10/0);
    }

    public static void doStuff(){
        doMoreStuff();
        System.out.println("doStuff Method");


    }

    public static void doMoreStuff(){

        System.out.println("Hello");
    }
}
