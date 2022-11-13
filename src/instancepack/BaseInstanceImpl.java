package instancepack;

/* Execution flow in case of Parent Child (Inheritance)
 Whenever any java programm execution stats, below sets of steps happens
1) Identify static members from top to bottom
2) Assignment of static variables & execution of static blocks in the same order from top to bottom
3) Main method execution
4) Identification of Instance members from top to bottom from Parent to child
5) Execution of instance variables initialization (assignment) & execution of Instance blocks of Parent
6) Execution of Parent Constructor
7) Execution of instance variables initialization (assignment) & execution of Instance blocks of Child
9) Execution of Child Constructor
 */

public class BaseInstanceImpl {


    int i=20;
    {
        m1();
        System.out.println("Parent Instance block");
    }
    BaseInstanceImpl(){
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        BaseInstanceImpl baseInstance = new BaseInstanceImpl();
        System.out.println("Parent Main Method");
    }
    public void m1(){
        System.out.println(j);
    }
    int j=30;
}
class ChildInstanceImpl extends BaseInstanceImpl{

    int x=100;
    {
        m2();
        System.out.println("Child 1st instance constructor");
    }
    ChildInstanceImpl(){
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        ChildInstanceImpl childInstance= new ChildInstanceImpl();
        System.out.println("Child Main method");
    }

    public void m2()
    {
        System.out.println(y);
    }
    {
        System.out.println("2nd Child instance block");
    }
    int y=200;
}
