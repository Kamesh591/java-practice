package constructor;

/*
The purpose of constructor is to initlization of object but not to create an object
The firstline in the constructor should be either super() or this(). if we don't mention this() or super() in user defined then Compiler will add super() as first line in constructor
 We can either super() or this() constructor but not both in the same user defined constructor
 super() or this() is only allowed inside consturctor but not from a method

 Only Allowed access specifiers for constructor are default or public.
 */
public class Student {

    String name;
    int rollno;

    public Student(){

    }
    public Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Kamesh",101);
        Student s2= new Student("Raghu",102);
    }
}
