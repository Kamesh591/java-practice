package constructor;

public class ConstructorOverloading {

    ConstructorOverloading(){
        this(10);
        System.out.println("No Arge");
    }

    ConstructorOverloading(int i){
        //ConstructorOverloading(10.5); We usually make these mistakes. I accedentally type className while creating construcot which is not allowed.
        this(10.5);
        System.out.println("This is int-arg constructor");

    }

    ConstructorOverloading(double d){
        System.out.println("This is Double-arg constrcitor");
    }

    public static void main(String[] args) {
        ConstructorOverloading constructorOverloading= new ConstructorOverloading();
        ConstructorOverloading constructorOverloading1= new ConstructorOverloading(10.5);
    }
}
