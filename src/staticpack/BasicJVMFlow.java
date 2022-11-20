package staticpack;

public class BasicJVMFlow {

    static int size=20;
    String name;
    {
        System.out.println("This is my first instance block");
        System.out.println(name);


    }

    {
        System.out.println("2nd instance block");
    }

    public BasicJVMFlow(String argName){
        this.name=argName;
        System.out.println("This constuctor");
        System.out.println(name);

    }



    static {
        System.out.println("the value provided for size is:"+size);

        System.out.println("This is my first static block");
    }

    static {
        System.out.println("2nd static block");
    }

    public static void main(String[] args) {
        System.out.println("This is my main method");
        BasicJVMFlow basicJVMFlow= new BasicJVMFlow("Kamesh");
    }
}
