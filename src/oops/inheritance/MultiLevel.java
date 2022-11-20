package oops.inheritance;

class GrandParent extends Object{
    int age=80;
    public void grandParent(){
        System.out.println("This is Grand Parent method");
    }


}

class Parents extends GrandParent
{
    public void parentsMethod(){
        System.out.println("This is parent method");
    }
}

class Childs extends Parents{
    public void childMethod(){
        System.out.println("This is the final child class");

    }
}





public class MultiLevel {

    public static void main(String[] args) {
             Childs childs= new Childs();
             childs.childMethod();
             childs.parentsMethod();
             childs.grandParent();
        System.out.println(childs.age);

        Parents parents= new Parents();
        parents.grandParent();
        parents.parentsMethod();
        //parents.childMethod();
    }
}
