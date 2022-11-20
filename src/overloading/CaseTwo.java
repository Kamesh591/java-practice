package overloading;

public class CaseTwo {

    public void m1(String s)
    {
        System.out.println("String method");
    }

    public void m1(StringBuffer sb){
        System.out.println("StringBuffer Method");
    }

    public static void main(String[] args) {
        CaseTwo caseTwo= new CaseTwo();
        caseTwo.m1("Durga");
        caseTwo.m1(new StringBuffer("Ram"));
        //caseTwo.m1(null);
    }
}
