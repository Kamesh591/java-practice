package overloading;

public class CaseOne {

    public void m1(Object o){
        System.out.println("Object version of method");
    }

    public void m1(String s){
        System.out.println("String version of method");


    }

    public static void main(String[] args) {
        CaseOne caseOne= new CaseOne();
        caseOne.m1(new Object());
        caseOne.m1("Kamesh");
        caseOne.m1(null);
    }
}
