package typecasting;

class A{
    int x=777;
}

class B extends A{
    int x=222;
}

class C extends B{
    int x=111;
}

public class CaseFour {

    public static void main(String[] args) {
        C c= new C();
        System.out.println(c.x);
        System.out.println(((B)c).x);
     //   System.out.println((A(B)).x);

    }



}
