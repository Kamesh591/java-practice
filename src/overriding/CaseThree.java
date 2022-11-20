package overriding;

class P{
    public final void marry(){
        System.out.println("Parent marry method");
    }

    public void m1(){
        System.out.println("This is for access specifier example");
    }

    protected void m2(){
        System.out.println("this is parent class protected m2 method");
    }

}
class C extends  P
{
   /* public void marry(){
        System.out.println("Child Marry method");
    }*/

   /* protected void m1(){
        System.out.println("This is  access speciitfed overrideen method");
    }*/

    public void m2(){
        System.out.println("this is parent class protected m2 method");
    }
}

public class CaseThree {

    public static void main(String[] args) {

        Parent parent= new Parent();
        parent.marry();

        Child child= new Child();
        child.marry();

        Parent parent1= new Child();
        parent1.marry();

    }


}
