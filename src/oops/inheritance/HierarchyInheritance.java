package oops.inheritance;

class Parent1{
    public void parentMethod(){
        System.out.println("Parent method");
    }

}

class Child1 extends Parent1{

    public void child1Method(){
        System.out.println("this is child1 specific method");
    }


}

class Child2 extends Parent1
{
    public void childMethod2(){
        System.out.println("This is child method2");
    }
}

public class HierarchyInheritance {

    static Child1 child1= new Child1();

    public static void main(String[] args) {
        child1.child1Method();
        child1.parentMethod();

        Child2 child2= new Child2();
        child2.childMethod2();
        child2.parentMethod();
    }


}
