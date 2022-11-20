package overloading;

class A
{

}
class B extends A
{

}

public class CaseFour {

    public void m1(A a){
        System.out.println("This is A method");
    }

    public void m1(B a){
        System.out.println("This is B method");
    }

    public static void main(String[] args) {
        CaseFour caseFour= new CaseFour();

        A a = new A();
        caseFour.m1(a);

        B b= new B();
        caseFour.m1(b);

        A a1= new B();
        caseFour.m1(a1); // In the case of overloading compiler always consider about reference type. hence A class method got the chance

    }
}
