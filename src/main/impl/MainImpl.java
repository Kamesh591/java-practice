package main.impl;

public class MainImpl {

   public static void main(String[] variables){

       int[] intarray;

       System.out.println("This is my main method");

       System.out.println(variables.length);

       int age=Integer.parseInt(variables[0]);
       System.out.println("The coverted Int value from string is:"+age);

       float fd= Float.parseFloat(variables[3]);
       System.out.println(fd);

    }
}


