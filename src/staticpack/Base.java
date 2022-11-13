package staticpack;

/*

During Derived class execution, the below process happens
Parent & Child classes are default loaded when we are running the Child class
If we are running only parent class then child class doesn't load
1) Identification of static members from parent to child class
2) Execution of static variable assignment & static blocks from parent to child
3) Derived class main method. If child doesn't contain main method then parent class Main method executed
 */
public class Base {
    static int i=10;
    static {
        m1();
        System.out.println("Base Static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Base Main");
    }

    public static void m1(){
        System.out.println(j);
    }
    static int j=20;
}

class Derived extends Base{
    static int x=100;
    static {
        m2();
        System.out.println("Derived class 1st static block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Derived class Main method");
    }
    public static void m2(){
        System.out.println(y);
    }
    static {
        System.out.println("Derived 2nd static block");
    }
    static int y=50;

}
