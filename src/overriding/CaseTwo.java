package overriding;

import java.util.Objects;

class Parents{

    //Covariant datatypes are allowed in overdiring which means if Parent class method contains Object return type then we can use String or StringBuffer return type in child class but vice versa not allowed.
    public Object marry(){
        System.out.println("Parent marry method");
        return null;
    }

}
class Childs extends  Parents
{
    public String marry(){
        System.out.println("Child Marry method");
        return null;
    }
}

public class CaseTwo {

    public static void main(String[] args) {

        Parents parent= new Parents();
        parent.marry();

        Childs child= new Childs();
        child.marry();

        Parents parent1= new Childs();
        parent1.marry();

    }


}
