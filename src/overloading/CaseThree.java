package overloading;

public class CaseThree {

    public void m1(int i, float f){
        System.out.println("int-float method");
    }

    public void m1(float f, int i){
        System.out.println("float-int method");
    }

    public static void main(String[] args) {
        CaseThree caseThree = new CaseThree();
        //always remember to use 10.5f when u r using floating points. f should be must.
        caseThree.m1(10,10.5f);
        caseThree.m1(10.5f,10);
       // caseThree.m1(10,10);
    }
}

