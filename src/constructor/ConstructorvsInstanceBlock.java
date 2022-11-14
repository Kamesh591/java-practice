package constructor;


/*
The best example for instance variable usage is if you want to know the list of objected created in the below programm we can use instance block.
 */


public class ConstructorvsInstanceBlock {
    static int count=0;
    {
        count++;
    }

    ConstructorvsInstanceBlock(){

    }

    ConstructorvsInstanceBlock(int i){

    }
    ConstructorvsInstanceBlock(double d){

    }

    public static void main(String[] args) {
        ConstructorvsInstanceBlock constructorvsInstanceBlock = new ConstructorvsInstanceBlock();
        ConstructorvsInstanceBlock constructorvsInstanceBlock1= new ConstructorvsInstanceBlock(10);
        ConstructorvsInstanceBlock constructorvsInstanceBlock2= new ConstructorvsInstanceBlock(10.5);
        System.out.println("Total number of Objects created "+count);

    }
}
