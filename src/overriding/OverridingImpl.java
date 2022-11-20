package overriding;

class Paarent{
    public void m1(int i){
        System.out.println("This is my parent method");
    }
}

class Cahild extends Paarent{

    public void m1(int x){
        System.out.println("This is my child version of Overridden m1 method");
    }
}
public class OverridingImpl {

    public static void main(String[] args) {
       /* parent parent1= new parent();
        parent1.m1(10);
*/
        Cahild child1= new Cahild();
        child1.m1(10);

        //with the help of parent class reference, you can hold child class object
        Paarent parent= new Cahild();
        parent.m1(10);
    }
}
