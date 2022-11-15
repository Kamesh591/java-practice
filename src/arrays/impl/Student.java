package arrays.impl;

public class Student {

    public static void main(String[] args) {
        String student1="Ramesh";
        String student2="Rakhee";
        String stundent3="Jameen";
        String student4="Sundaresh";
        int studentrollno1=1;
        int studentrollno2=2;
        int studentrollno3=3;
        int studentrollno4=4;

        //Array: If we want to store similar kind of groups of data then we can use array
        //Syntax: datatype[] variablename= new datatype[size];
        //declare & initialize datatype[] variablename={"","",""};

        //Arrays index starts from 0

        String[] student= new String[30];
        int[] rollno={1,2,3,4,5,6,7};
        String[] class2={"Ramesh","Suresh","Rajesh","Ravindra"};
        String[] names2={"Ramesh","Suresh","Rajesh","Raghu","SHalini"};

        student[0]="Kamesh";
        student[1]="Raghu";
        student[2]="Jashwant";
        student[3]="teju";
        student[4]="Jahnavi";
        student[5]="chaitanya";

        for (String students: student){
            System.out.println(students);
        }
    }
}


