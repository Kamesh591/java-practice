package oops.inheritance;

class Parent{
    public void pocketMoney(){
        System.out.println("Parent should provide pocket money to child");
    }

}

class Child extends Parent
{
    public void enjoy(){
        System.out.println("Enjoy with the parent provided PocketMoney");
    }

}

public class SimpleInheritanceImpl {

    public static void main(String[] args) {

        Child child= new Child();
        child.pocketMoney();
       // child.

    }
}
