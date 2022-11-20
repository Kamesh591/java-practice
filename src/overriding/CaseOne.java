package overriding;

class Parent{
    public void marry(){
        System.out.println("Parent marry method");
    }

}
class Child extends  Parent
{
    public void marry(){
        System.out.println("Child Marry method");
    }
}

public class CaseOne {

    public static void main(String[] args) {

        Parent parent= new Parent();
        parent.marry();

        Child child= new Child();
        child.marry();

        Parent parent1= new Child();
        parent1.marry();

    }


}
