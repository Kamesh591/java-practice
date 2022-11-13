package accessspecifier;

public class DefaultAccessImpl {

    static int age=20;

    static void printAge(){
        System.out.println("Age os the Defautl Access Impl is:"+age);
    }

    public static void main(String[] args) {
        System.out.println(age);
       printAge();
    }
}
