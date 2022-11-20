package oops;

public class StudentImpl {

    public static void main(String[] args) {
        Student student1= new Student();
        Student student2= new Student();
        Student student3= new Student();
        Student student4= new Student(5,"Sarita");
        student1.Name="Kamesh";
        student1.rollno=20;

        student2.Name="Jahnavi";
        student2.rollno=30;

        student3.Name="Jashu";
        student3.rollno=10;


        //ObjectName.attribute/action(method)name

       /* System.out.println("The name & rollno of 1st student is:\t "+student1.Name +"=====\t"+student1.rollno);
        System.out.println("The name & rollno of 2nd student is: \t"+student2.Name +"=====\t"+student2.rollno);
        System.out.println("The name & rollno of 3rd student is: \t"+student3.Name +"=====\t"+student3.rollno);*/

        /*student1.write();
        student1.play();
        student1.read();*/
        student1.studentDetails(student1.Name, student1.rollno);
        student2.studentDetails(student2.Name, student2.rollno);
        student3.studentDetails(student3.Name, student3.rollno);

    }
}
