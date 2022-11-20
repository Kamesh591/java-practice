package oops;

 public class Student {

     static String className="First Class";

     int rollno;
     String Name;
     char gender;
     String fatherOccupation;

     public Student(){

     }

     {
         System.out.println("This is Instance block and will be executed at the time time of every object creation");
     }

     static
     {
         System.out.println("This is static block");
     }
     //Step1 . Drivier initlization /driver assignment SQL Oracle, PostGres,. Redis
     // prepare the statmeent //
     //Exeucte the query


     public Student(int constructorRollno,String COnstructorName){
         this.rollno=constructorRollno;
         this.Name=COnstructorName;

     }
     public void read(){
         System.out.println("THis is Read method");

     }


     public void write(){
         System.out.println("This is Write MEthod");
     }
     public void play(){

         System.out.println("This is Play Method");

     }

     public void studentDetails(String name, int rollno){
         System.out.println("The class student details are:"+name+"==="+"rollno"+rollno);
     }

}
