package practice.chapter1;

import java.util.Scanner;

public class ReadAWrite {

    public static void main(String[] args) {
        System.out.println("Please enter the interger value");
        Scanner scanner = new Scanner(System.in);
        try{
            int userInput=  scanner.nextInt();
            System.out.println("The user entered integer value is:"+userInput);
        }
        catch (Exception e)
        {
            System.out.println("The programm explained to write Interger but entered other data type. Please enter a int value");
        }
        System.out.println("This should be executed after the programm");


    }
}
