package overriding;


// in case of var arg method overriding becomes, overloading due to diff arg types and in overloding method resolution based on reference type
class ParentVarArg{
    public void m1(String... args){
        System.out.println("Parent marry method");
    }

}
class ChildSimpleMethod extends  ParentVarArg
{
    public void m1(String s){
        System.out.println("Child Marry method");
    }
}

public class CaseFourVarArg {

    public static void main(String[] args) {

        ParentVarArg parent= new ParentVarArg();
        parent.m1();

        ChildSimpleMethod child= new ChildSimpleMethod();
        child.m1();

        ParentVarArg parent1= new ChildSimpleMethod();
        parent1.m1();


        System.out.println("With strings passing");
        System.out.println("=====================");
        parent.m1("Raghu");
        child.m1("Raju");
        parent1.m1("Raghu");

    }


}
