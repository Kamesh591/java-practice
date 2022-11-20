package main.impl;

public  class AdditionImpl implements AddInterface{

    @Override
    public void add(int a, int b) {

        System.out.println("Sum of 2 numbers is:"+(a+b));

    }

   // abstract public void addition();

    public static void main(String[] args) {
        AdditionImpl addition= new AdditionImpl();
       // addition.addition();
        addition.add(10,20);

        //JVM doesn't allow object creation for Abstract classed and Interfaces'
    }
}
