package instancepack;

/*
Whenever any java programm execution stats, below sets of steps happens
1) Identify static members from top to bottom
2) Assignment of static variables & execution of static blocks in the same order from top to bottom
3) Main method execution
4) Identification of Instance members from top to bottom
5) Execution of instance variables initialization & execution of Instance blocks
6) Execution of Constructor
7) It's not requested to create object unnecessarily until there is a real need as it's time consuming activity and  all activiites like above from step 4 to step 6 executes.
8) static variable & block initialization happens only once at the time of class loading
9) Incase of instance blocks, constructor & variables, everytime when a new object creates, everything executed
 */

public class SimpleInstanceTest {
    static  int age=20;
    int i=10;
    {
        m1();
        System.out.println("First instance block");
        System.out.println(age);
    }
    SimpleInstanceTest(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        SimpleInstanceTest simpleInstanceTest=new SimpleInstanceTest();
        System.out.println("Main Method");
    }
    public void m1(){
        System.out.println(j);
    }
    {
        System.out.println("2nd instance block");
    }
    int j=20;
    }

